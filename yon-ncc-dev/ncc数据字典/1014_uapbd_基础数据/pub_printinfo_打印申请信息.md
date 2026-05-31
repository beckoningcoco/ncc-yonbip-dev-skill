# |<<

**打印申请信息 (pub_printinfo / nc.vo.uapbd.printpf.PrintProposeInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4755.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_proposeinfo | 打印申请主键 | pk_proposeinfo | char(20) | √ | 主键 (UFID) |
| 2 | prnbillno | 单据号 | prnbillno | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | billdata | 单据日期 | billdata | char(19) |  | 日期时间 (UFDateTime) |
| 6 | printcount | 已打印次数 | printcount | int |  | 整数 (Integer) |
| 7 | alternum | 申请次数 | alternum | int |  | 整数 (Integer) |
| 8 | alterednum | 申请后次数 | alterednum | int |  | 整数 (Integer) |
| 9 | pk_printnum | 打印次数主键 | pk_printnum | varchar(50) |  | 字符串 (String) |
| 10 | remark | 备注 | remark | text(1024) |  | BLOB (BLOB) |
| 11 | proposer | 调整人 | proposer | varchar(20) |  | 用户 (user) |