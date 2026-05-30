# |<<

**成本卷积关系明细 (sca_costconvrel_b / nc.vo.sca.costconvrel.entity.CostConvRelItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5048.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | costconvrel_bid | 成本卷积关系明细ID | costconvrel_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_costconvrel | 成本卷积关系ID | pk_costconvrel | char(20) | √ | 主键 (UFID) |
| 3 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 4 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | pk_marbasclass | 物料基本分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 6 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 7 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 8 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 9 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 10 | materialhashkey | 物料哈希值 | materialhashkey | int |  | 整数 (Integer) |
| 11 | materialinfo | 物料信息 | materialinfo | varchar(1450) |  | 字符串 (String) |
| 12 | vbfree1 | 自由辅助属性1 | vbfree1 | varchar(101) |  | 自由项 (Custom) |
| 13 | vbfree2 | 自由辅助属性2 | vbfree2 | varchar(101) |  | 自由项 (Custom) |
| 14 | vbfree3 | 自由辅助属性3 | vbfree3 | varchar(101) |  | 自由项 (Custom) |
| 15 | vbfree4 | 自由辅助属性4 | vbfree4 | varchar(101) |  | 自由项 (Custom) |
| 16 | vbfree5 | 自由辅助属性5 | vbfree5 | varchar(101) |  | 自由项 (Custom) |
| 17 | vbfree6 | 自由辅助属性6 | vbfree6 | varchar(101) |  | 自由项 (Custom) |
| 18 | vbfree7 | 自由辅助属性7 | vbfree7 | varchar(101) |  | 自由项 (Custom) |
| 19 | vbfree8 | 自由辅助属性8 | vbfree8 | varchar(101) |  | 自由项 (Custom) |
| 20 | vbfree9 | 自由辅助属性9 | vbfree9 | varchar(101) |  | 自由项 (Custom) |
| 21 | vbfree10 | 自由辅助属性10 | vbfree10 | varchar(101) |  | 自由项 (Custom) |