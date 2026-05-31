# |<<

**参照生成错误信息 (sca_bom_errmsg / nc.vo.sca.costbom.entity.RefBuildErrMsgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5034.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pkmartacvt | 主键 | pkmartacvt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | bomversion4stuff | 材料BOM版本号 | bomversion4stuff | varchar(50) |  | 字符串 (String) |
| 5 | packversion4stuff | 材料包装BOM版本号 | packversion4stuff | varchar(50) |  | 字符串 (String) |
| 6 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 7 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 8 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 9 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 10 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 11 | finstoragetype | 入库类型 | finstoragetype | int |  | 产成品入库类型 (InStorageTypeEnum) |  | 1=自制; |