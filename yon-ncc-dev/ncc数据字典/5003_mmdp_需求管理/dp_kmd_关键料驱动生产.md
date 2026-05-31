# |<<

**关键料驱动生产 (dp_kmd / nc.vo.mmdp.kmd.entity.KeyMaterialDrivenVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1744.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_kmd | 主键 | pk_kmd | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | ninvbalance | 存量 | ninvbalance | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | npab | 可用量 | npab | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | cmeasureid | 主单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |