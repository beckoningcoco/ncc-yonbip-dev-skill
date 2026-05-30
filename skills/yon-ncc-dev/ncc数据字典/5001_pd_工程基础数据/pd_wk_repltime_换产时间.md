# |<<

**换产时间 (pd_wk_repltime / nc.vo.pd.pd0404.entity.WkRepltimeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4389.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cwk_replaceid | 换产时间定义 | cwk_replaceid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) | √ | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cprematrelat | 换产前生产线物料关系 | cprematrelat | varchar(20) |  | 生产线物料 (pd_wk_prodinv) |
| 6 | cprematerialid | 换产前物料最新版本 | cprematerialid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cprematerialvid | 换产前物料 | cprematerialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | cprevendorid | 换产前供应商 | cprevendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 9 | cpreprojectid | 换产前项目 | cpreprojectid | varchar(20) |  | 项目 (project) |
| 10 | cpreproductorid | 换产前生产厂家 | cpreproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 11 | cprecustomerid | 换产前客户 | cprecustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 12 | vprefree1 | 换产前自由辅助属性1 | vprefree1 | varchar(101) |  | 自由项 (Custom) |
| 13 | vprefree2 | 换产前自由辅助属性2 | vprefree2 | varchar(101) |  | 自由项 (Custom) |
| 14 | vprefree3 | 换产前自由辅助属性3 | vprefree3 | varchar(101) |  | 自由项 (Custom) |
| 15 | vprefree4 | 换产前自由辅助属性4 | vprefree4 | varchar(101) |  | 自由项 (Custom) |
| 16 | vprefree5 | 换产前自由辅助属性5 | vprefree5 | varchar(101) |  | 自由项 (Custom) |
| 17 | vprefree6 | 换产前自由辅助属性6 | vprefree6 | varchar(101) |  | 自由项 (Custom) |
| 18 | vprefree7 | 换产前自由辅助属性7 | vprefree7 | varchar(101) |  | 自由项 (Custom) |
| 19 | vprefree8 | 换产前自由辅助属性8 | vprefree8 | varchar(101) |  | 自由项 (Custom) |
| 20 | vprefree9 | 换产前自由辅助属性9 | vprefree9 | varchar(101) |  | 自由项 (Custom) |
| 21 | vprefree10 | 换产前自由辅助属性10 | vprefree10 | varchar(101) |  | 自由项 (Custom) |
| 22 | caftermatrelat | 换产后生产线物料关系 | caftermatrelat | varchar(20) |  | 生产线物料 (pd_wk_prodinv) |
| 23 | caftermaterialid | 换产后物料最新版本 | caftermaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 24 | caftermaterialvid | 换产后物料 | caftermaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 25 | caftervendorid | 换产后供应商 | caftervendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 26 | cafterprojectid | 换产后项目 | cafterprojectid | varchar(20) |  | 项目 (project) |
| 27 | cafterproductorid | 换产后生产厂家 | cafterproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 28 | caftercustomerid | 换产后客户 | caftercustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 29 | vafterfree1 | 换产后自由辅助属性1 | vafterfree1 | varchar(101) |  | 自由项 (Custom) |
| 30 | vafterfree2 | 换产后自由辅助属性2 | vafterfree2 | varchar(101) |  | 自由项 (Custom) |
| 31 | vafterfree3 | 换产后自由辅助属性3 | vafterfree3 | varchar(101) |  | 自由项 (Custom) |
| 32 | vafterfree4 | 换产后自由辅助属性4 | vafterfree4 | varchar(101) |  | 自由项 (Custom) |
| 33 | vafterfree5 | 换产后自由辅助属性5 | vafterfree5 | varchar(101) |  | 自由项 (Custom) |
| 34 | vafterfree6 | 换产后自由辅助属性6 | vafterfree6 | varchar(101) |  | 自由项 (Custom) |
| 35 | vafterfree7 | 换产后自由辅助属性7 | vafterfree7 | varchar(101) |  | 自由项 (Custom) |
| 36 | vafterfree8 | 换产后自由辅助属性8 | vafterfree8 | varchar(101) |  | 自由项 (Custom) |
| 37 | vafterfree9 | 换产后自由辅助属性9 | vafterfree9 | varchar(101) |  | 自由项 (Custom) |
| 38 | vafterfree10 | 换产后自由辅助属性10 | vafterfree10 | varchar(101) |  | 自由项 (Custom) |
| 39 | nreplacetime | 换产时间 | nreplacetime | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | ftimeunit | 时间单位 | ftimeunit | int |  | 时间单位 (TimeUnitEnum) |  | 1=小时; |