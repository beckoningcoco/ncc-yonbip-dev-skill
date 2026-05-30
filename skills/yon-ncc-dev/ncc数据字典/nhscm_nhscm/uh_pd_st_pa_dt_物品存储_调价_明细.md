# |<<

**物品存储_调价_明细 (uh_pd_st_pa_dt / com.yonyou.yh.nhis.scm.uhpd.vo.UhPdStPaDtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6155.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdpadt | 物品调价明细主键 | pk_pdpadt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_pdpa | 调价 | pk_pdpa | varchar(20) |  | 物品存储_调价_明细 (UhPdStPaDtVO) |
| 5 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 6 | pk_pd | 物品 | pk_pd | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | pk_measdoc_sales | 包装单位_零售 | pk_measdoc_sales | varchar(20) |  | 计量单位 (measdoc) |
| 8 | factor_sb | 换算系数_零售与基本 | factor_sb | varchar(50) |  | 字符串 (String) |
| 9 | price_before_sales | 调整前单价_零售 | price_before_sales | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | price_after_sales | 调整后单价_零售 | price_after_sales | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | note | 备注 | note | varchar(50) |  | 字符串 (String) |