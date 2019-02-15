package edu.quinnipiac.ser210.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static edu.quinnipiac.ser210.tictactoe.R.id.*;

public class TicTacToe extends AppCompatActivity implements View.OnClickListener {
    private static final int ROWS = 3, COLS = 3; // number of rows and columns
    private int[][] board = new int[ROWS][COLS]; // game board in 2D array
    private int prevMove;
    Button b0;
    Button b1;
    Button b2;

    Button b3;
    Button b4;
    Button b5;

    Button b6;
    Button b7;
    Button b8;
    int gameStatus;
    Button resetBtn;
    TextView gameLbl;
    String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
        prevMove = 0;
        gameStatus = 0;
        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);

        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);

        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);




        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);

        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        resetBtn = (Button) findViewById(R.id.resetButton);
        value = getIntent().getStringExtra("name");
         gameLbl = (TextView) findViewById(R.id.gameText);
        gameLbl.setText(value + "s turn");
    }
    public void setMove(int player, int location) {
        // TODO Auto-generated method stub
        prevMove = location;
        if (location < 9 && location >= 0) {
            if (location == 0) board[0][0] = player;
            else if (location == 1) board[0][1] = player;
            else if (location == 2) board[0][2] = player;
            else if (location == 3) board[1][0] = player;
            else if (location == 4) board[1][1] = player;
            else if (location == 5) board[1][2] = player;
            else if (location == 6) board[2][0] = player;
            else if (location == 7) board[2][1] = player;
            else board[2][2] = player;
        }

    }
    public void getComputerMove() {
        // TODO Auto-generated method stub
		/*int r = findRow(prevMove);
		int c = findCol(prevMove);
		if(c<2) {
			if(board[r][c] == 1) {

				if(board[r])
				if(board[r][c+1] == 0) {

				if(board[rSystem.out.println("quick block H");
				return turnBoardIntoLocation(r,c+1);//block quick horizontal
			}
		}
		}
		if(r<2) {
			if(board[r][c] == 1 && board[r][c+1] == 0) {
				System.out.println("quick block H");
				return turnBoardIntoLocation(r,c+1);//block quick horizontal
		}
		*/
		if(prevMove == 0) {
            if (board[0][1] == 1) {
                if (board[0][2] == 0) {
                    b2.setBackgroundResource(R.drawable.o); //big block horizontal
                    setMove(2,2);
                    updateComp();
                    Log.v("GIOVANNI", "big block horz");
                }
            } else if (board[1][0] == 1) {
                if (board[2][0] == 0) {
                    b6.setBackgroundResource(R.drawable.o); //big block vertical
                    setMove(2,6);
                    updateComp();
                    Log.v("GIOVANNI", "big block vert");
                }
            } else if (board[0][1] == 0) {
                b1.setBackgroundResource(R.drawable.o); //small block horz
                setMove(2,1);
                updateComp();
                Log.v("GIOVANNI", "small block horz");
            } else if (board[1][0] == 0) {
                b3.setBackgroundResource(R.drawable.o);//small block vert
                setMove(2,3);
                updateComp();
                Log.v("GIOVANNI", "small block vert");
            }
            else if(board[1][1] == 1){
                if(board[2][2] == 0){
                    b8.setBackgroundResource(R.drawable.o); //big diag block
                    setMove(2,8);
                    updateComp();
                }
            }
        }

       else if(prevMove == 1){
            if (board[0][2] == 1) {
                if (board[0][0] == 0) {
                    b0.setBackgroundResource(R.drawable.o); //big block horizontal
                    setMove(2,0);
                    updateComp();
                    Log.v("GIOVANNI", "big block horiz1");
                }
            } else if (board[1][1] == 1) {
                if (board[2][1] == 0) {
                    b7.setBackgroundResource(R.drawable.o); //big block vertical
                    setMove(2,7);
                    updateComp();
                    Log.v("GIOVANNI", "big block vert1");
                }
            } else if (board[0][2] == 0) {
                b2.setBackgroundResource(R.drawable.o); //small block horz
                setMove(2,2);
                updateComp();
                Log.v("GIOVANNI", "small block horz1");
            } else if (board[1][1] == 0) {
                b4.setBackgroundResource(R.drawable.o);//small block vert
                setMove(2,4);
                updateComp();
                Log.v("GIOVANNI", "small block vert1");
            }

        }
        else if(prevMove == 2){
            if (board[0][1] == 1) {
                if (board[0][0] == 0) {
                    b0.setBackgroundResource(R.drawable.o); //big block horizontal
                    setMove(2,0);
                    updateComp();
                    Log.v("GIOVANNI", "big block horiz2");
                }
            } else if (board[1][2] == 1) {
                if (board[2][2] == 0) {
                    b8.setBackgroundResource(R.drawable.o); //big block vertical
                    setMove(2,8);
                    updateComp();
                    Log.v("GIOVANNI", "big block vert2");
                }
            } else if (board[0][1] == 0) {
                b1.setBackgroundResource(R.drawable.o); //small block horz
                setMove(2,1);
                updateComp();
                Log.v("GIOVANNI", "small block horz2");
            } else if (board[1][2] == 0) {
                b5.setBackgroundResource(R.drawable.o);//small block vert
                setMove(2,5);
                updateComp();
                Log.v("GIOVANNI", "small block vert2");
            }

        }
        else if(prevMove == 3){
            if (board[1][1] == 1) {
                if (board[1][2] == 0) {
                    b5.setBackgroundResource(R.drawable.o); //big block horizontal
                    setMove(2,5);
                    updateComp();
                    Log.v("GIOVANNI", "big block horiz3");
                }
            } else if (board[0][0] == 1) {
                if (board[2][0] == 0) {
                    b6.setBackgroundResource(R.drawable.o); //big block vertical
                    setMove(2,6);
                    updateComp();
                    Log.v("GIOVANNI", "big block vert3");
                }
            } else if (board[1][1] == 0) {
                b4.setBackgroundResource(R.drawable.o); //small block horz
                setMove(2,4);
                updateComp();
                Log.v("GIOVANNI", "small block horz3");
            } else if (board[0][0] == 0) {
                b0.setBackgroundResource(R.drawable.o);//small block vert
                setMove(2,0);
                updateComp();
                Log.v("GIOVANNI", "small block vert3");
            }

        }
        else if(prevMove == 4){
            if (board[1][0] == 1) {
                if (board[1][2] == 0) {
                    b5.setBackgroundResource(R.drawable.o); //big block horizontal
                    setMove(2,5);
                    updateComp();
                    Log.v("GIOVANNI", "big block horiz4");
                }
            } else if (board[0][1] == 1) {
                if (board[2][1] == 0) {
                    b7.setBackgroundResource(R.drawable.o); //big block vertical
                    setMove(2,7);
                    updateComp();
                    Log.v("GIOVANNI", "big block vert4");
                }
            }
            else if(board[0][0] == 1){
                if(board[2][2]== 0){
                    b8.setBackgroundResource(R.drawable.o);//small block vert
                    setMove(2,8);
                    updateComp();
                    Log.v("GIOVANNI", "big block diag4");
                }
            }
            else if(board[0][2]== 1){
                if(board[2][0] == 0){
                    b6.setBackgroundResource(R.drawable.o);//small block vert
                    setMove(2,6);
                    updateComp();
                    Log.v("GIOVANNI", "big block diag4");
                }
            }
            else if (board[1][0] == 0) {
                b3.setBackgroundResource(R.drawable.o); //small block horz
                setMove(2,3);
                updateComp();
                Log.v("GIOVANNI", "small block horz4");
            } else if (board[2][1] == 0) {
                b7.setBackgroundResource(R.drawable.o);//small block vert
                setMove(2,7);
                updateComp();
                Log.v("GIOVANNI", "small block vert4");
            }


        }
        else if(prevMove == 5){
            if (board[1][1] == 1) {
                if (board[1][0] == 0) {
                    b0.setBackgroundResource(R.drawable.o); //big block horizontal
                    setMove(2,0);
                    updateComp();
                    Log.v("GIOVANNI", "big block horiz5");
                }
            } else if (board[0][2] == 1) {
                if (board[2][2] == 0) {
                    b8.setBackgroundResource(R.drawable.o); //big block vertical
                    setMove(2,8);
                    updateComp();
                    Log.v("GIOVANNI", "big block vert5");
                }
            } else if (board[1][1] == 0) {
                b4.setBackgroundResource(R.drawable.o); //small block horz
                setMove(2,4);
                updateComp();
                Log.v("GIOVANNI", "small block horz5");
            } else if (board[0][2] == 0) {
                b2.setBackgroundResource(R.drawable.o);//small block vert
                setMove(2,2);
                updateComp();
                Log.v("GIOVANNI", "small block vert5");
            }

        }
        else if(prevMove == 6){
            if (board[2][1] == 1) {
                if (board[2][2] == 0) {
                    b8.setBackgroundResource(R.drawable.o); //big block horizontal
                    setMove(2,8);
                    updateComp();
                    Log.v("GIOVANNI", "big block horiz6");
                }
            } else if (board[1][0] == 1) {
                if (board[0][0] == 0) {
                    b0.setBackgroundResource(R.drawable.o); //big block vertical
                    setMove(2,0);
                    updateComp();
                    Log.v("GIOVANNI", "big block vert6");
                }
            } else if (board[2][1] == 0) {
                b7.setBackgroundResource(R.drawable.o); //small block horz
                setMove(2,7);updateComp();
                Log.v("GIOVANNI", "small block horz6");
            } else if (board[1][0] == 0) {
                b3.setBackgroundResource(R.drawable.o);//small block vert
                setMove(2,3);
                updateComp();
                Log.v("GIOVANNI", "small block vert6");
            }

        }
        else if(prevMove == 7){
            if (board[2][2] == 1) {
                if (board[2][0] == 0) {
                    b0.setBackgroundResource(R.drawable.o); //big block horizontal
                    setMove(2,0);
                    updateComp();
                    Log.v("GIOVANNI", "big block horiz7");
                }
            } else if (board[1][1] == 1) {
                if (board[0][1] == 0) {
                    b1.setBackgroundResource(R.drawable.o); //big block vertical
                    setMove(2,1);
                    updateComp();
                    Log.v("GIOVANNI", "big block vert7");
                }
            } else if (board[2][2] == 0) {
                b8.setBackgroundResource(R.drawable.o); //small block horz
                setMove(2,8);
                updateComp();
                Log.v("GIOVANNI", "small block horz7");
            } else if (board[1][1] == 0) {
                b4.setBackgroundResource(R.drawable.o);//small block vert
                setMove(2,4);
                updateComp();
                Log.v("GIOVANNI", "small block vert7");
            }

        }
        else if(prevMove == 8){
            if (board[2][1] == 1) {
                if (board[2][0] == 0) {
                    b0.setBackgroundResource(R.drawable.o); //big block horizontal
                    setMove(2,0);
                    updateComp();
                    Log.v("GIOVANNI", "big block horiz8");
                }
            } else if (board[1][2] == 1) {
                if (board[0][2] == 0) {
                    b2.setBackgroundResource(R.drawable.o); //big block vertical
                    setMove(2,2);
                    updateComp();
                    Log.v("GIOVANNI", "big block vert8");
                }
            } else if (board[2][1] == 0) {
                b7.setBackgroundResource(R.drawable.o); //small block horz
                setMove(2,7);
                updateComp();
                Log.v("GIOVANNI", "small block horz8");
            } else if (board[1][2] == 0) {
                b5.setBackgroundResource(R.drawable.o);//small block vert
                setMove(2,5);
                updateComp();
                Log.v("GIOVANNI", "small block vert8");
            }

        }
        //POSITION 0
     /*   if (board[0][0] == 1) {

             else {
                if (board[0][1] == 0) {
                    b1.setBackgroundResource(R.drawable.o);
                } else if (board[1][0] == 1) {
                    if (board[2][0] == 0) {
                        b6.setBackgroundResource(R.drawable.o);
                    }

                } else if (board[1][0] == 0) {
                    b3.setBackgroundResource(R.drawable.o);
                }
            }
        }

        //POSITION 1
        if (board[0][1] == 1) {
            if (board[0][2] == 1) {
                if (board[0][0] == 0) {
                    b0.setBackgroundResource(R.drawable.o);//blocks
                }
            } else if (board[1][1] == 1) {
                if (board[2][1] == 0) {
                    b6.setBackgroundResource(R.drawable.o);//blocks
                }
            } else if (board[0][2] == 0) {
                b2.setBackgroundResource(R.drawable.o);
            }
        }
        //POSITION 2
        if (board[0][2] == 1) {
            if (board[1][2] == 1) {
                if (board[2][2] == 0) {
                    b8.setBackgroundResource(R.drawable.o);//blocks
                }
            } else if (board[1][2] == 0) {

                b5.setBackgroundResource(R.drawable.o);//blocks

            }

        }
        //POSITION 3
        if (board[1][0] == 1) {
            if (board[2][0] == 1) {
                if (board[0][0] == 0) {
                    b0.setBackgroundResource(R.drawable.o);
                }

            }
            else {
                if (board[1][1] == 1) {
                    b5.setBackgroundResource(R.drawable.o);
                } else if (board[1][1] == 0) {
                    b4.setBackgroundResource(R.drawable.o);


                }
            }
        }

        //POSITION 4
        if (board[1][1] == 1) {
            if (board[2][1] == 0) {
                b7.setBackgroundResource(R.drawable.o);
            } else {
                if (board[1][2] == 0) {
                    b5.setBackgroundResource(R.drawable.o);
                }
            }
        }
        //POSITION 5
        if (board[1][2] == 1) {
            if (board[2][2] == 0) {
                b8.setBackgroundResource(R.drawable.o);
            } else {
                if (board[1][1] == 0) {
                    b4.setBackgroundResource(R.drawable.o);
                }
            }
        }
        //POSITION 6
        if (board[2][0] == 1) {
            if (board[2][1] == 0) {
                b7.setBackgroundResource(R.drawable.o);
            } else {
                if (board[1][0] == 0) {
                    b3.setBackgroundResource(R.drawable.o);
                }
            }
        }
        //POSITION 7
        if (board[2][1] == 1) {
            if (board[2][2] == 0) {
                b8.setBackgroundResource(R.drawable.o);
            } else {
                if (board[2][0] == 0) {
                    b6.setBackgroundResource(R.drawable.o);
                } else {
                    if (board[1][1] == 0) {
                        b4.setBackgroundResource(R.drawable.o);
                    }
                }
            }
        }
        //POSITION 8

        if (board[2][2] == 1) {
            if (board[2][1] == 0) {
                b8.setBackgroundResource(R.drawable.o);
            } else {
                if (board[1][2] == 0) {
                    b4.setBackgroundResource(R.drawable.o);
                }
            }
        }
*/

    }
    public int checkForWinner() {
        //checks horizontal win
        for (int row = 0; row < ROWS; ++row) {
            if(board[row][0] == 1) {

                if(board[row][1] == 1) {
                    if(board[row][2] == 1) {
                        return 2;
                    }
                }

            }

        }
        //checks vertical win
        for (int col = 0; col < COLS; ++col) {
            if(board[0][col] == 1) {
                if(board[1][col] == 1) {
                    if(board[2][col] == 1) {
                        return 2;
                    }
                }
            }
        }
        //check diagonal win
        if(board[0][0] == 1) {
            if(board[1][1] == 1) {
                if(board[2][2] == 1) {
                    return 2;
                }
            }
        }
        if(board[0][2] == 1) {
            if(board[1][1] == 1) {
                if(board[2][0] == 1) {
                    return 2;
                }
            }
        }


        //checks horizontal win comp
        for (int row = 0; row < ROWS; ++row) {
            if(board[row][0] == 2) {

                if(board[row][1] == 2) {
                    if(board[row][2] == 2) {
                        return 3;
                    }
                }

            }

        }
        //checks vertical win
        for (int col = 0; col < COLS; ++col) {
            if(board[0][col] == 2) {
                if(board[1][col] == 2) {
                    if(board[2][col] == 2) {
                        return 3;
                    }
                }
            }
        }
        //check diagonal win
        if(board[0][0] == 2) {
            if(board[1][1] == 2) {
                if(board[2][2] == 2) {
                    return 3;
                }
            }
        }
        if(board[0][2] == 2) {
            if(board[1][1] == 2) {
                if(board[2][0] == 2) {
                    return 3;
                }
            }
        }

        return 0; //no winner
    }
public void update(){
    gameStatus = checkForWinner();
    if(gameStatus == 0) {
        getComputerMove();
    }

    else if(gameStatus == 2){

        TextView gameTxt = (TextView) findViewById(R.id.gameText);
        gameTxt.setText("Player 1 Wins");

        //resetBtn.setVisibility(visible);
        resetBtn.setEnabled(true);

    }
    else if(gameStatus == 3){

        TextView gameTxt = (TextView) findViewById(R.id.gameText);
        gameTxt.setText("Computer Wins");
        resetBtn.setEnabled(true);
    }
}
    public void updateComp(){
        gameStatus = checkForWinner();

        if(gameStatus == 3){
            TextView gameTxt = (TextView) findViewById(R.id.gameText);
            gameTxt.setText("Computer Wins");
            resetBtn.setEnabled(true);
        }
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.b0:
                    b0.setBackgroundResource(R.drawable.x);
                    prevMove = 0;
                    setMove(1,0);
                    update();
                break;

            case R.id.b1:

                    b1.setBackgroundResource(R.drawable.x);
                prevMove = 1;
                setMove(1,1);
                update();
                break;
            case R.id.b2:

                    b2.setBackgroundResource(R.drawable.x);
                prevMove = 2;
                setMove(1,2);
                update();
                break;
            case R.id.b3:

                b3.setBackgroundResource(R.drawable.x);
                prevMove = 3;
                setMove(1,3);
                update();
                break;
            case R.id.b4:
                b4.setBackgroundResource(R.drawable.x);
                prevMove = 4;
                setMove(1,4);
                update();
                break;
            case R.id.b5:
                b5.setBackgroundResource(R.drawable.x);
                prevMove = 5;
                setMove(1,5);
                update();
                break;
            case R.id.b6:
                b6.setBackgroundResource(R.drawable.x);
                prevMove = 6;
                setMove(1,6);
                update();
                break;
            case R.id.b7:
                b7.setBackgroundResource(R.drawable.x);
                prevMove = 7;
                setMove(1,7);
                update();
                break;
            case R.id.b8:
                b8.setBackgroundResource(R.drawable.x);
                prevMove = 8;
                setMove(1,8);
                update();
                break;
            case R.id.resetButton:
                clearBoard();
                resetBtn.setEnabled(false);


        }


    }
    public void clearBoard(){
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[i].length;j++){
                board[i][j] = 0;
            }
        }
        gameStatus = 0;
        gameLbl.setText(value + "s turn");
        b0.setBackgroundResource(R.drawable.tile);
        b1.setBackgroundResource(R.drawable.tile);
        b2.setBackgroundResource(R.drawable.tile);
        b3.setBackgroundResource(R.drawable.tile);
        b4.setBackgroundResource(R.drawable.tile);
        b5.setBackgroundResource(R.drawable.tile);
        b6.setBackgroundResource(R.drawable.tile);
        b7.setBackgroundResource(R.drawable.tile);
        b8.setBackgroundResource(R.drawable.tile);
    }
}
