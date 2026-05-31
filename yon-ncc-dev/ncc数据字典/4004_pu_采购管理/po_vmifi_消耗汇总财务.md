# |<<

**消耗汇总财务 (po_vmifi / nc.vo.pu.m4202.entity.VmiFIHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4642.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stockps_b | 消耗汇总财务主标识 | pk_stockps_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_stockps | 消耗汇总财务辅标识 | pk_stockps | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 公司 | pk_org | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 5 | pk_org_v | 公司版本 | pk_org_v | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 6 | pk_storeorg_v | 库存组织版本 | pk_storeorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 7 | pk_storeorg | 库存组织 | pk_storeorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 8 | pk_financeorg_v | 结算财务组织版本 | pk_financeorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 9 | pk_financeorg | 结算财务组织 | pk_financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 10 | pk_costregion | 成本域 | pk_costregion | varchar(20) |  | 组织_成本域 (costregion) |
| 11 | pk_srcmaterial | 物料最新版本 | pk_srcmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 12 | pk_material | 物料编码 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 13 | pk_batchcode | 批次档案 | pk_batchcode | varchar(20) |  | 批次档案 (BatchcodeVO) |
| 14 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 15 | dbizdate | 业务日期 | dbizdate | char(19) |  | 日期 (UFDate) |
| 16 | castunitid | 单位 | castunitid | varchar(20) |  | 字符串 (String) |
| 17 | ninnum | 消耗主数量 | ninnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | ninassistnum | 汇总数量 | ninassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | cprojectid | 项目 | cprojectid | varchar(20) |  | 字符串 (String) |
| 20 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 21 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 22 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 23 | cstateid | 库存状态 | cstateid | varchar(20) |  | 字符串 (String) |
| 24 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 25 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 26 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 27 | nnetprice | 主本币无税净价 | nnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | ntaxnetprice | 主本币含税净价 | ntaxnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | pk_costappsn | 传成本和应付人 | pk_costappsn | varchar(20) |  | 人员基本信息 (psndoc) |
| 30 | dtocostapdate | 暂估日期 | dtocostapdate | varchar(19) |  | 日期 (UFDate) |
| 31 | nestnum | 暂估主数量 | nestnum | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 32 | nestprice | 暂估本币无税单价 | nestprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | nesttaxrate | 税率 | nesttaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | nesttaxprice | 暂估本币含税单价 | nesttaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | nestoprice | 暂估无税单价 | nestoprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | nestotaxprice | 暂估含税单价 | nestotaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | nesttaxmny | 税额 | nesttaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | nestmny | 本币无税金额 | nestmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | nesttotalmny | 本币价税合计 | nesttotalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | pk_estcurrency | 币种 | pk_estcurrency | varchar(20) |  | 币种 (currtype) |
| 41 | nestexhgrate | 折本汇率 | nestexhgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | nestomny | 无税金额 | nestomny | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | nestototalmny | 价税合计 | nestototalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | festtaxtype | 扣税类别 | festtaxtype | int |  | 扣税类别 (taxtype) | 1 | 1=应税外加; |