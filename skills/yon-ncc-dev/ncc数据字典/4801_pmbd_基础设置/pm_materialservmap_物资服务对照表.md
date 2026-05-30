# |<<

**物资服务对照表 (pm_materialservmap / nc.vo.pmbd.materialservmap.MaterialServMapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4482.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialservmap | 物资服务对照表主键 | pk_materialservmap | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_materialtype | 物料分类 | pk_materialtype | varchar(20) |  | 物料基本分类 (marbasclass) |
| 4 | pk_material | 物料编码 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 5 | service | 服务编码 | service | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 7 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 9 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 10 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 11 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 18 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 19 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 20 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 21 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |