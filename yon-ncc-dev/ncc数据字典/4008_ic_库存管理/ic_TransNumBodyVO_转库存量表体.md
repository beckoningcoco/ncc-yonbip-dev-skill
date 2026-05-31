# |<<

**转库存量表体 (ic_TransNumBodyVO / nc.vo.ic.m4k.entity.TransNumBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2996.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbid | 转库存量表体主键 | cbid | varchar(50) | √ | 字符串 (String) |
| 2 | bselected | 选择 | bselected | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | cstateid | 库存状态 | cstateid | varchar(20) |  | 库存状态 (ic_storestate) |
| 4 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 5 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 6 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 7 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 8 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 9 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 10 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nassistnum | 数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | pk_batchcode | 批次主键 | pk_batchcode | varchar(20) |  | 主键 (UFID) |
| 13 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 14 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 15 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 16 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 17 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 18 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 19 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 20 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 21 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 22 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 23 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 24 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |