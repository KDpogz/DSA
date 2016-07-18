int array[] = {1,2,3,4,5,6,7,8,9,10}

int Qsize = 10

int numItem
int qeueu[]

		void show{
				
					out("Queue elements")
				
				for(i=0;i<Qsize;i++){
				
					out("Queue ["+(i+1)+"]: "+array[i])
									}
					}



		boolean Full(){

				if(numItem==Qsize){

						out("Full")

						return true
										}
				else{

						return false

						}

							}


		boolean Empty(){

				if(numItem==0){


					out("Empty")

					return true
									}
				else{

						return false
					
						}

							}


		boolean Insert(int value){

				if(Full()){

					queue[numItem]= value
					
					out("Input :"= value)
					
					return true
					}

				else{
					
					out("The value "+value +"is not 

					Inserted")
					
					return false
					
					}
							}

		void arrange(){

  			 	for (int i = (array[].length - 1); i >= 0; i--){
     
     			for (int j = 1; j ≤ i; j++){
     
        			 if (array[j-1] > array[j]){

            	  int temp = array[j-1];
         
             		array[j-1] = array[j];
         
            		array[j] = temp;
   		 							}
   								 } 
   	 												}
							}


		int peekFront(){

					return queue[0]

								}

		int peekRear(){

					return queue[numItem-1]
			}
