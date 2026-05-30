# |<<

**物品存储_库单_明细_关联 (uh_pd_st_dt_rl / com.yonyou.yh.nhis.scm.pdst.vo.ScmPdStItemRlVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6153.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdstdttl | 物品存储库单明细关联主键 | pk_pdstdttl | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_st_out | 库单_出库 | pk_st_out | varchar(50) |  | 字符串 (String) |
| 5 | sortno_out | 序号_出库 | sortno_out | int |  | 整数 (Integer) |
| 6 | pk_st_in | 库单_入库 | pk_st_in | varchar(50) |  | 字符串 (String) |
| 7 | sortno_in | 序号_入库 | sortno_in | int |  | 整数 (Integer) |
| 8 | quan_base | 数量_基本 | quan_base | decimal(14, 2) |  | 数值 (UFDouble) |
| 9 | price_p_base | 购入单价 | price_p_base | decimal(14, 2) |  | 数值 (UFDouble) |
| 10 | price_s_base | 零售单价 | price_s_base | decimal(14, 2) |  | 数值 (UFDouble) |
| 11 | amt_p | 购入金额 | amt_p | decimal(14, 2) |  | 数值 (UFDouble) |
| 12 | amt_s | 零售金额 | amt_s | decimal(14, 2) |  | 数值 (UFDouble) |
| 13 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |