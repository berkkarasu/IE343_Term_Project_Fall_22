public class Track{
        public int track_id;
        public int track_duration;
        public int track_individual_value;
        public double[] track_sequential_value;
        public Track(int track_id, int track_duration, int track_individual_value, double[] track_sequential_value){
                this.track_id = track_id;
                this.track_duration = track_duration;
                this.track_individual_value = track_individual_value;
                this.track_sequential_value = track_sequential_value;
        }
        public int getId(){
                return track_id;
        }
        public void setId(int track_id){
                this.track_id = track_id;
        }
        public int getDuration(){
                return track_duration;
        }
        public void setDuration(int track_duration){
                this.track_duration = track_duration;
        }
        public int getIndividualValue(){
                return track_individual_value;
        }
        public void setIndividualValue(int track_individual_value){
                this.track_individual_value = track_individual_value;
        }
        public double[] getSequentialValue(){
                return track_sequential_value;
        }
        public void setSequentialValue(double[] track_sequential_value){
                this.track_sequential_value = track_sequential_value;
        }
}