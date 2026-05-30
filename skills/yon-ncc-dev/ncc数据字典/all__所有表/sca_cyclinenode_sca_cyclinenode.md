# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11406.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccyclinenodeid | ccyclinenodeid | ccyclinenodeid | char(20) | √ |
| 2 | bisroot | bisroot | bisroot | char(1) |
| 3 | ccosttypeid | ccosttypeid | ccosttypeid | varchar2(20) |  |  | '~' |
| 4 | ccyclineidpath | ccyclineidpath | ccyclineidpath | varchar2(50) |  |  | '1' |
| 5 | ccyclinepath | ccyclinepath | ccyclinepath | varchar2(700) |
| 6 | cmaterialid | cmaterialid | cmaterialid | varchar2(20) |  |  | '~' |
| 7 | cnodeid | cnodeid | cnodeid | char(20) |
| 8 | nseq | nseq | nseq | number(38, 0) |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |