// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
        float valores[]=new float[]{
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
                1,10,2,11,20,0,0,21,30,4,13,22,0,0,
        };
        System.out.println("Maior faturaento é :"+maiorFaturamento(valores));
        System.out.println("Menor faturaento é :"+menorFaturamento(valores));
        System.out.println("Dias acima da Media de faturamento é :"+diasAcimadaMediaFaturamento(valores));

    }


    private static float maiorFaturamento(float valores[]){
        float maior=0;
        for(int i=0;i<valores.length;i++){
            if(valores[i]>maior){
                maior=valores[i];
            }
        }
        return maior;

    }
    private static float menorFaturamento(float valores[]){
        float menor=-1;
        for(int i=0;i<valores.length;i++){
            if(menor==-1&&valores[i]!=0){
                menor=valores[i];
            }
            else if(valores[i]<menor&&valores[i]!=0){
                menor=valores[i];
            }
        }
        return menor;
    }
    private static int diasAcimadaMediaFaturamento(float valores[]){
        float media=0;
        int dias=0;
        int diasMaiores=0;
        for(int i=0;i<valores.length;i++){
            if(valores[i]>0){
                dias++;
            }
            media+=valores[i];
        }
        media=media/dias;
        System.out.println("A Média é :"+media);
        for(int i=0;i<valores.length;i++){
            if(valores[i]>media){
                diasMaiores++;
            }
        }
        return diasMaiores;
    }

}