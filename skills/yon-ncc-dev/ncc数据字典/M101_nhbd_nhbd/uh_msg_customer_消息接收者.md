# |<<

**消息接收者 (uh_msg_customer / com.yonyou.yh.nhis.bd.tpi.uhmsg.vo.UhMsgCusVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6128.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msgcustomer | 消息接收者主键 | pk_msgcustomer | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_msg | 消息主键 | pk_msg | char(20) |  | 主键 (UFID) |
| 5 | eu_role | 接收者类型 | eu_role | varchar(50) |  | 字符串 (String) |
| 6 | code_customer | 接收者编码 | code_customer | varchar(50) |  | 字符串 (String) |
| 7 | note | 备注 | note | varchar(50) |  | 字符串 (String) |