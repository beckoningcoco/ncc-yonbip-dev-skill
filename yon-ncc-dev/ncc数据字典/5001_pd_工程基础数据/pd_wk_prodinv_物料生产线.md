# |<<

**物料生产线 (pd_wk_prodinv / nc.vo.pd.pd0408.entity.MaterProHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4388.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmaterproid | 物料生产线 | cmaterproid | char(20) | √ | 主键 (UFID) |
| 2 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) | √ | 物料基本信息 (material_v) |
| 3 | cmaterialvid | 物料 | cmaterialvid | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 4 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 5 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 6 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 7 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 8 | cmaterialclassid | 物料分类 | cmaterialclassid | varchar(20) |  | 物料基本分类 (marbasclass) |
| 9 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 10 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 11 | cpdwkid | 生产线 | cpdwkid | char(20) |  | 字符串 (String) |
| 12 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 13 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 14 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 15 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 16 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 17 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 18 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 19 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 20 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 21 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |