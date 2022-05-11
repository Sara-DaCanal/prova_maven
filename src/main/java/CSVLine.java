public class CSVLine {

    private String version;
    private String path;
    private long size;

    public CSVLine(String version, String path, long size){
        this.version=version;
        this.path=path;
        this.size=size;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public long getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String[] toStringArray(){
        String[] arr = {this.version, this.path,  Long.toString(this.size)};
        return arr;
    }

    public boolean isEqual(CSVLine l){
        if(!this.version.contentEquals(l.version)) return false;
        else if(!this.path.contentEquals(l.path)) return false;
        else if(this.size != l.size) return false;
        else return true;
    }

    public boolean isPathEqual(CSVLine l){
        if(this.path.contentEquals(l.path)) return true;
        else return false;
    }

    public void addSize(long s){
        this.size = this.size + s;
    }
}
