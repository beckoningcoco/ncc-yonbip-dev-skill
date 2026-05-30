# |<<

**凭证头 (iufo_vouch_head / nc.vo.hbbb.vouch.VouchHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3535.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vouchhead | 凭证ID标识 | pk_vouchhead | char(20) | √ | 主键 (UFID) |
| 2 | iorder | 凭证编号 | iorder | varchar(40) |  | 字符串 (String) |
| 3 | pk_org | 编制单位 | pk_org | varchar(20) |  | 组织_业务单元_报表组织 (reportorg) |
| 4 | input_date | 制单日期 | input_date | char(19) |  | 日期 (UFDate) |
| 5 | pk_user | 制单人 | pk_user | varchar(20) |  | 用户 (user) |
| 6 | alone_id | alone_id | alone_id | char(32) |  | 字符串 (String) |
| 7 | vouch_type | 凭证类型 | vouch_type | int |  | 凭证类型 (vouchtype) |  | 1=手工录入个别报表调整凭证; |