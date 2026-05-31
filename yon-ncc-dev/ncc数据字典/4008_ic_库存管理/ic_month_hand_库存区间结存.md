# |<<

**库存区间结存 (ic_month_hand / nc.vo.ic.mobalance.entity.MonthHandVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2928.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 2 | pk_org | 库存组织最新版本 | pk_org | char(20) | √ | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_org_v | 库存组织 | pk_org_v | char(20) | √ | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 4 | cwarehouseid | 仓库 | cwarehouseid | char(20) | √ | 仓库 (stordoc) |
| 5 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 6 | cmaterialvid | 物料编码 | cmaterialvid | char(20) | √ | 物料基本信息（多版本） (material) |
| 7 | cmaterialoid | 物料 | cmaterialoid | char(20) | √ | 物料基本信息 (material_v) |
| 8 | castunitid | 单位 | castunitid | char(20) | √ | 计量单位 (measdoc) |
| 9 | pk_batchcode | 批次档案PK | pk_batchcode | varchar(20) |  | 批次档案 (BatchcodeVO) |
| 10 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 11 | vchangerate | 换算率 | vchangerate | varchar(60) | √ | 字符串 (String) |
| 12 | cvmivenderid | 寄存供应商 | cvmivenderid | varchar(20) |  | 供应商基本信息 (supplier) |
| 13 | ctplcustomerid | 货主客户 | ctplcustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 14 | cstateid | 库存状态 | cstateid | varchar(20) |  | 库存状态 (ic_storestate) |
| 15 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 16 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 17 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 18 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nassistnum | 数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | ngrossnum | 毛重 | ngrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | dyearmonth | 年月份 | dyearmonth | char(7) | √ | 字符串 (String) |
| 22 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 23 | nretnum | 还回主数量 | nretnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nretassistnum | 还回数量 | nretassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | nretgrossnum | 还回毛重 | nretgrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 27 | vfree1 | 物料自由属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 28 | vfree2 | 物料自由属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 29 | vfree3 | 物料自由属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 30 | vfree4 | 物料自由属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 31 | vfree5 | 物料自由属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 32 | vfree6 | 物料自由属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 33 | vfree7 | 物料自由属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 34 | vfree8 | 物料自由属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 35 | vfree9 | 物料自由属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 36 | vfree10 | 物料自由属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |