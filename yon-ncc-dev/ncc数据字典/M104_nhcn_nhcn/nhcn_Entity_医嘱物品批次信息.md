# |<<

**医嘱物品批次信息 (nhcn_Entity / com.yonyou.yh.nhis.cn.ord.vo.CNPresLineBatchVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3820.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordpddt | 医嘱物品申请单明细主键 | pk_ordpddt | char(20) | √ | 主键 (UFID) |
| 2 | pk_batch_pd | 物品批次主键 | pk_batch_pd | varchar(50) |  | 字符串 (String) |
| 3 | batch_pd | 物品批号 | batch_pd | varchar(50) |  | 字符串 (String) |
| 4 | pk_sp | 供应商主键 | pk_sp | varchar(50) |  | 字符串 (String) |
| 5 | pk_fac | 生产厂商主键 | pk_fac | varchar(50) |  | 字符串 (String) |
| 6 | pk_bill | 对应记费明细主键 | pk_bill | varchar(50) |  | 字符串 (String) |
| 7 | purprice_sp | 成本价 | purprice_sp | decimal(14, 8) |  | 数值 (UFDouble) |
| 8 | batch_quan | 批次数量 | batch_quan | decimal(14, 2) |  | 数值 (UFDouble) |
| 9 | sale_price | 零售价 | sale_price | decimal(14, 8) |  | 数值 (UFDouble) |