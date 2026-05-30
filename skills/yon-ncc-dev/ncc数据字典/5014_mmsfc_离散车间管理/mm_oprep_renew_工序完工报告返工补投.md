# |<<

**工序完工报告返工补投 (mm_oprep_renew / nc.vo.mmsfc.operationrep.renew.entity.OprepRenewVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3714.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_renew | 工序完工报告返工补投 | pk_renew | varchar(50) | √ | 字符串 (String) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | freworkremotype | 后续加工 | freworkremotype | int |  | 后续处理方式 (OprepNextProcessEnum) |  | 1=下一道序; |