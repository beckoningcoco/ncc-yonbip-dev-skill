# |<<

**基数药 (bd_uh_pd_base / com.yonyou.yh.nhis.bd.uhpd.vo.BaseDrugManagerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1068.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdbase | 主键 | pk_pdbase | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_dept | 所属部门 | pk_dept | varchar(50) |  | 字符串 (String) |
| 5 | pk_pd | 物品编码 | pk_pd | varchar(50) |  | 字符串 (String) |
| 6 | pk_measdoc_cur | 包装单位_当前 | pk_measdoc_cur | varchar(50) |  | 字符串 (String) |
| 7 | pk_measdoc_base | 包装单位_基本 | pk_measdoc_base | varchar(50) |  | 字符串 (String) |
| 8 | factor_cb | 换算系数公式_当前单位/基本单位 | factor_cb | varchar(50) |  | 字符串 (String) |
| 9 | quan | 物品基数_基本包装 | quan | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | price_sale | 价格 | price_sale | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | note | 备注 | note | varchar(50) |  | 字符串 (String) |