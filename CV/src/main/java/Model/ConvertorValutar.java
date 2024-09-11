package Model;

public class ConvertorValutar {
    private float result = 0;
    private int fromCurrency = 0;
    private int toCurrency = 0;

   private static final float[] RONto = {1.0f,0.20f,0.22f,0.3f,0.33f};
   private static final float[] EURto = {4.97f,1f,1.1f,1.5f,1.66f};
   private static final float[] USDto = {4.5f,0.91f,1f,1.36f,1.5f};
   private static final float[] CADto = {3.32f,0.67f,0.74f,1f,1.1f};
   private static final float[] AUDto = {3f,0.6f,0.67f,0.91f,1f};
   private static float[][] currencies = new float[5][5];

    {
        currencies[0] = RONto;
        currencies[1] = EURto;
        currencies[2] = USDto;
        currencies[3] = CADto;
        currencies[4] = AUDto;
    }

    public void setResult(int fromCurrency, int toCurrency, float sum) {

        switch (fromCurrency) {
            case 0:
                result = sum * RONto[toCurrency];
                break;
            case 1:
                result = sum * EURto[toCurrency];
                break;
            case 2:
                result = sum * USDto[toCurrency];
                break;
            case 3:
                result = sum * CADto[toCurrency];
                break;
            case 4:
                result = sum * AUDto[toCurrency];
                break;
        }
    }


    public float getResult(){
       return result;
   }

    public void setFromCurrency(int fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public void setToCurrency(int toCurrency) {
        this.toCurrency = toCurrency;
    }

    public static String getCurrencies(int from,int to) {

        String s = String.valueOf(currencies[from][to]);
        return s;

    }
}
