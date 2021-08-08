object CaeserCipher
{
    def main(args:Array[String])
    {
        val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        val encrypt =(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
        val decrypt =(c:Char,key:Int,a:String)=> if((a.indexOf(c.toUpper)-key)<0) a((a.indexOf(c.toUpper)-key+a.size) % a.size)
            else a((a.indexOf(c.toUpper)-key)%a.size)

        
        val cipher =(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

        val Faa ="Functional Programming"
        val f = Faa.replace(" ","")


        val ct=cipher(encrypt,f,5,alphabet)
        val cp=cipher(decrypt,ct,5,alphabet)

        println(ct)
        println(cp)
    }
}