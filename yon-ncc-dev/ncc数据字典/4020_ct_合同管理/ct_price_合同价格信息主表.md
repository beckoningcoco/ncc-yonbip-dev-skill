# |<<

**合同价格信息主表 (ct_price / nc.vo.ct.price.entity.CtPriceHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1661.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ct_price | 合同价格主表主键 | pk_ct_price | char(20) | √ | 主键 (UFID) |
| 2 | pk_oid | 原始版本 | pk_oid | char(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | blatest | 是否最新版本 | blatest | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | pk_org | 采购组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 6 | vcode | 合同价格信息编码 | vcode | varchar(50) |  | 字符串 (String) |
| 7 | vname | 合同价格信息名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | cvendorid | 供应商编码 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 9 | pk_marbasclass | 物料分类编码 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 10 | pk_material | 物料编码 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 11 | castunitid | 报价单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 12 | corigcurrencyid | 币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 13 | pk_pricetemplet | 价格模板编码 | pk_pricetemplet | varchar(20) |  | 价格模板 (ct_pricetemplet) |
| 14 | iversion | 版本 | iversion | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | bvalidateflag | 生效 | bvalidateflag | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | dvaldate | 生效日期 | dvaldate | char(19) |  | 日期(开始) (UFDateBegin) |
| 17 | dinvallidate | 失效日期 | dinvallidate | char(19) |  | 日期(结束) (UFDateEnd) |
| 18 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 19 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 20 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 21 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 22 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 23 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 24 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 25 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 26 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 27 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 28 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vdef21 | 自定义项21 | vdef21 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vdef22 | 自定义项22 | vdef22 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vdef23 | 自定义项23 | vdef23 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vdef24 | 自定义项24 | vdef24 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vdef25 | 自定义项25 | vdef25 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vdef26 | 自定义项26 | vdef26 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vdef27 | 自定义项27 | vdef27 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vdef28 | 自定义项28 | vdef28 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vdef29 | 自定义项29 | vdef29 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vdef30 | 自定义项30 | vdef30 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vdef31 | 自定义项31 | vdef31 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vdef32 | 自定义项32 | vdef32 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vdef33 | 自定义项33 | vdef33 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vdef34 | 自定义项34 | vdef34 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vdef35 | 自定义项35 | vdef35 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vdef36 | 自定义项36 | vdef36 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vdef37 | 自定义项37 | vdef37 | varchar(101) |  | 自定义项 (Custom) |
| 65 | vdef38 | 自定义项38 | vdef38 | varchar(101) |  | 自定义项 (Custom) |
| 66 | vdef39 | 自定义项39 | vdef39 | varchar(101) |  | 自定义项 (Custom) |
| 67 | vdef40 | 自定义项40 | vdef40 | varchar(101) |  | 自定义项 (Custom) |
| 68 | vdef41 | 自定义项41 | vdef41 | varchar(101) |  | 自定义项 (Custom) |
| 69 | vdef42 | 自定义项42 | vdef42 | varchar(101) |  | 自定义项 (Custom) |
| 70 | vdef43 | 自定义项43 | vdef43 | varchar(101) |  | 自定义项 (Custom) |
| 71 | vdef44 | 自定义项44 | vdef44 | varchar(101) |  | 自定义项 (Custom) |
| 72 | vdef45 | 自定义项45 | vdef45 | varchar(101) |  | 自定义项 (Custom) |
| 73 | vdef46 | 自定义项46 | vdef46 | varchar(101) |  | 自定义项 (Custom) |
| 74 | vdef47 | 自定义项47 | vdef47 | varchar(101) |  | 自定义项 (Custom) |
| 75 | vdef48 | 自定义项48 | vdef48 | varchar(101) |  | 自定义项 (Custom) |
| 76 | vdef49 | 自定义项49 | vdef49 | varchar(101) |  | 自定义项 (Custom) |
| 77 | vdef50 | 自定义项50 | vdef50 | varchar(101) |  | 自定义项 (Custom) |
| 78 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 79 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 80 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 81 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |