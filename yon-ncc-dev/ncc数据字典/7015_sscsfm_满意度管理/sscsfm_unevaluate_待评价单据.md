# |<<

**待评价单据 (sscsfm_unevaluate / nc.vo.sscsfm.sfmpub.UnEvaluateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5627.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_unevaluate | 唯一标识 | pk_unevaluate | char(20) | √ | 主键 (UFID) |
| 2 | pk_rule | 评价规则主键 | pk_rule | varchar(20) |  | 满意度管理评价规则 (sscsfm_evaluation_rule) |
| 3 | pk_sscunit | 共享中心主键 | pk_sscunit | varchar(20) |  | 共享服务中心 (sscunit) |
| 4 | pk_group | 集团主键 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 组织主键 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | billid | 单据主键 | billid | varchar(20) |  | 字符串 (String) |
| 7 | billno | 单据号 | billno | varchar(200) |  | 字符串 (String) |
| 8 | pk_billmaker | 制单人 | pk_billmaker | varchar(20) |  | 用户 (user) |
| 9 | billdate | 制单日期 | billdate | char(19) |  | 日期 (UFDate) |
| 10 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 交易类型 (transtype) |
| 11 | pk_tradetype | 交易类型 | pk_tradetype | varchar(20) |  | 交易类型 (transtype) |
| 12 | starttime | 开始时间 | starttime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | endtime | 结束时间 | endtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | sendstate | 邮件发送状态 | sendstate | int |  | 整数 (Integer) |