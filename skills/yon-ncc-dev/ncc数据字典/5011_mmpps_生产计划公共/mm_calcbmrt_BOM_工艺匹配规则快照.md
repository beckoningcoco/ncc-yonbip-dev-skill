# |<<

**BOM/工艺匹配规则快照 (mm_calcbmrt / nc.vo.mmpps.calc.entity.vermatch.BomMatchRtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3634.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cppsbmrtid | BOM/工艺匹配快照主键 | cppsbmrtid | char(36) | √ | 主键 (UFID) |
| 2 | cbmrtid | BOM/工艺匹配主键 | cbmrtid | varchar(20) |  | 字符串 (String) |
| 3 | cppsmaterialid | 物料范围主键 | cppsmaterialid | varchar(36) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 7 | fmfgtype | 生产类型 | fmfgtype | int |  | 整数 (Integer) |
| 8 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 10 | ccustmaterialid | 客户物料码 | ccustmaterialid | varchar(20) |  | 客户物料码 (custmaterial) |
| 11 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 12 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 13 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 14 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 15 | cbomid | 生产BOM版本 | cbomid | varchar(20) |  | 物料清单 (bd_bom) |
| 16 | cpackbomid | 包装BOM版本 | cpackbomid | varchar(20) |  | 物料清单 (bd_bom) |
| 17 | crtid | 工艺路线版本 | crtid | varchar(20) |  | 工艺路线主表 (pd_rt) |
| 18 | deffectdate | 生效日期 | deffectdate | char(19) |  | 日期(开始) (UFDateBegin) |
| 19 | dloseeffectdate | 失效日期 | dloseeffectdate | char(19) |  | 日期(结束) (UFDateEnd) |
| 20 | computecode | 运算标识 | computecode | varchar(40) |  | 字符串 (String) |
| 21 | cpsid | 计划方案 | cpsid | varchar(20) |  | 计划方案 (mm_ps) |
| 22 | fverprotype | 生产BOM版本类型 | fverprotype | int |  | 整数 (Integer) |
| 23 | fverpacktype | 包装BOM版本类型 | fverpacktype | int |  | 整数 (Integer) |
| 24 | fverrttype | 工艺路线版本类型 | fverrttype | int |  | 整数 (Integer) |
| 25 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 26 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 27 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 28 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 29 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 30 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 31 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 32 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 33 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 34 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 35 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 36 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 37 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 38 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 39 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |