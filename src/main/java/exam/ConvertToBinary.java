StringBuilder result=new
  StringBuilder();
for(int i=31;i>=0;i--)
{
  int mask=1<<i;
  result.append((x&mask)!=0?
                1:0);
}
Return result.toString();
