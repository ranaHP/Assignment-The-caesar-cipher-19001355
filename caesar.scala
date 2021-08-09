object caesar{

	
	def main(args:Array[String] ){
		val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		val key = (scala.io.StdIn.readLine("Enter the shift: ").toInt + alphabet.size) % alphabet.size
		val SecretMsgInput = scala.io.StdIn.readLine("Enter the Message: ")
		val SecretMsgOutput = SecretMsgInput.map( (c: Char) => { 

			val x = alphabet.indexOf(c.toUpper)
			if (x == -1){
				c
			}
			else{
				alphabet((x + key) % alphabet.size)
				} 
		});
		println(SecretMsgOutput);

	}	

}