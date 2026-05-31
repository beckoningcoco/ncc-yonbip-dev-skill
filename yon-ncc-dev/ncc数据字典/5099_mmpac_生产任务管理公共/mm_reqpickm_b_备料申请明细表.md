# |<<

**备料申请明细表 (mm_reqpickm_b / nc.vo.mmpac.reqpickm.entity.ReqPickmItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3762.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | creqpickm_bid | 备料申请明细 | creqpickm_bid | char(20) | √ | 主键 (UFID) |
| 2 | vrowno | 行号 | vrowno | varchar(20) |  | 字符串 (String) |
| 3 | creqpickmid | 备料申请单 | creqpickmid | char(20) |  | 主键 (UFID) |
| 4 | creqpickm_sid | 备料申请汇总 | creqpickm_sid | char(20) |  | 主键 (UFID) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 7 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 8 | cmoid | 生产订单 | cmoid | varchar(20) |  | 字符串 (String) |
| 9 | vmobillcode | 生产订单号 | vmobillcode | varchar(40) |  | 字符串 (String) |
| 10 | vmotype | 生产订单单据类型 | vmotype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 11 | vpickmbilltype | 备料计划单据类型 | vpickmbilltype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 12 | cpickmid | 备料计划 | cpickmid | varchar(20) |  | 字符串 (String) |
| 13 | vpickmbillcode | 备料计划单号 | vpickmbillcode | varchar(40) |  | 字符串 (String) |
| 14 | cpickmbid | 备料计划表体 | cpickmbid | varchar(50) |  | 字符串 (String) |
| 15 | vputplantype | 投放计划单据类型 | vputplantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 16 | cputplanid | 投放计划单 | cputplanid | varchar(20) |  | 字符串 (String) |
| 17 | vputplancode | 投放计划单号 | vputplancode | varchar(40) |  | 字符串 (String) |
| 18 | csourcebillid | 来源表头 | csourcebillid | char(20) |  | 主键 (UFID) |
| 19 | csourcebillbid | 来源表体 | csourcebillbid | char(20) |  | 主键 (UFID) |
| 20 | csourcebillcode | 来源单号 | csourcebillcode | varchar(40) |  | 字符串 (String) |
| 21 | csourcebilltype | 来源单据类型 | csourcebilltype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 22 | fitemtype | 子项类型 | fitemtype | int |  | 备料计划子项类型 (FitemtypeEnum) |  | 0=普通; |