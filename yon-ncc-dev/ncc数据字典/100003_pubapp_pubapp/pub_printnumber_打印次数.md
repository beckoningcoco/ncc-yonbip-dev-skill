# |<<

**打印次数 (pub_printnumber / nc.vo.uapbd.printnumber.PrintNumberVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4758.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_printnumber | 打印次数主键 | pk_printnumber | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 业务单元 | pk_org | varchar(20) | √ | 组织 (org) |
| 3 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 4 | billcode | 单据编号 | billcode | varchar(50) |  | 字符串 (String) |
| 5 | billdata | 单据日期 | billdata | char(19) |  | 日期时间 (UFDateTime) |
| 6 | printnumber | 已打印次数 | printnumber | int |  | 整数 (Integer) |
| 7 | printlimit | 限制次数 | printlimit | int |  | 整数 (Integer) |
| 8 | alternum | 申请次数 | alternum | int |  | 整数 (Integer) |  | [0 , ] |
| 9 | operator | 制单人 | operator | varchar(20) |  | 用户 (user) |
| 10 | billid | 单据主键 | billid | varchar(50) |  | 字符串 (String) |
| 11 | controltype | 控制方式 | controltype | int |  | 控制方式 (contrltyp) |  | 0=提示; |