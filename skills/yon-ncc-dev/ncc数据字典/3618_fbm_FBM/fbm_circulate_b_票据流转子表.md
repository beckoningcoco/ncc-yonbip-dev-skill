# |<<

**票据流转子表 (fbm_circulate_b / nc.vo.fbm.circulate.CirculateBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2121.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_circulate_b | 主键 | pk_circulate_b | char(20) | √ | 主键 (UFID) |
| 2 | recrsamt | 追索金额 | recrsamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 3 | dischgamt | 同意清偿金额 | dischgamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | tranrate | 贴现利率 | tranrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 6 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 7 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 8 | propsrname | 申请人户名 | propsrname | varchar(150) |  | 字符串 (String) |
| 9 | rcvrrname | 接收人户名 | rcvrrname | varchar(150) |  | 字符串 (String) |
| 10 | rcvrracctid | 接收人账号 | rcvrracctid | varchar(150) |  | 字符串 (String) |
| 11 | propsrbanknum | 申请人开户行号 | propsrbanknum | varchar(150) |  | 字符串 (String) |
| 12 | rcvrrbanknum | 接收人开户行号 | rcvrrbanknum | varchar(150) |  | 字符串 (String) |
| 13 | propsrorgid | 申请人开户行组织结构代码 | propsrorgid | varchar(150) |  | 字符串 (String) |
| 14 | rcvrrorgid | 接收人开户行组织结构代码 | rcvrrorgid | varchar(150) |  | 字符串 (String) |
| 15 | trantype | 贴现类型 | trantype | varchar(4) |  | 字符串 (String) |
| 16 | businesstype | 流转类别 | businesstype | varchar(50) |  | 流转状态 (FBMBusinessTypeEnum) |  | 01=出票登记; |