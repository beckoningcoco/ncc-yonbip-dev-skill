# |<<

**派工单 (mm_dispatchlist / nc.vo.mmsfc.dispatchlist.entity.DispatchlistHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3657.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dispatchlist | 派工单标识 | pk_dispatchlist | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 3 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | vbillcode | 派工单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 7 | ctrantypeid | 派工单类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | vtrantypecode | 派工单类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 9 | fstatusflag | 状态 | fstatusflag | int |  | 派工单单据状态 (EnumDispatchStatus) |  | 1=自由; |