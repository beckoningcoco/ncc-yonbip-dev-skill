# |<<

**成本结转层次-检查 (cm_tranlevelcheck / nc.vo.cm.tranlevel.TranLevelCheckVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1518.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ctranlevelcheckid | 检查 | ctranlevelcheckid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂最新版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | vbillcode | 单据号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 7 | ccostobjectid | 成本对象 | ccostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 8 | inote | 提示 | inote | int |  | 提示 (tranlevelnoteenum) |  | 1=无完工; |