/*if(row == -1 && col == n) 
      {
        col = n - 2;
        row = 0;
      }
      if( myArray[row][col] != 0) 
      {
        row = prRow - 2;
        col = prCol - 1;
      }
      myArray[row][col] = k;
      row++;
      col++;
      if(col == n) 
      {
        col = 0;
      }
      if(row == n) 
      {
        row = 0;
      }

      prRow = row;
      prCol = col;
      
      myArray[row][col] = k;
      row--;
      col++;
      if(row == -1) 
      {
        row = n - 1;
      }
      if(col == n) 
      {
        col = 0;
      }
      if(row == n - 1 && col == 0) 
      {
        row = 1;
        col = n - 1;
      }
      if(myArray[row][col] != 0) 
      {
        row+= 2;
        col--;
        if(row == n) 
        {
          row = 0;
        }
        if(col == -1) 
        {
          col = 0;
        }
      }*/