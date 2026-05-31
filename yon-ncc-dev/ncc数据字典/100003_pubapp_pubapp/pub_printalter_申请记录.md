# |<<

**申请记录 (pub_printalter / nc.vo.uapbd.printnumber.PrintAlterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4754.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_printalter | 调整记录主键 | pk_printalter | char(20) | √ | 主键 (UFID) |
| 2 | alternum | 申请次数 | alternum | int |  | 整数 (Integer) |
| 3 | proposdata | 制单日期 | proposdata | char(19) |  | 日期时间 (UFDateTime) |
| 4 | proposer | 制单人 | proposer | varchar(20) |  | 用户 (user) |
| 5 | pk_printnumber | 打印次数 | pk_printnumber | varchar(20) |  | 打印次数 (printnumber) |
| 6 | pk_printpf | 申请单主键 | pk_printpf | varchar(50) |  | 字符串 (String) |
| 7 | pk_printinfo | 申请信息主键 | pk_printinfo | varchar(50) |  | 字符串 (String) |