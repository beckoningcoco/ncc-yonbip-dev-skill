# |<<

**医疗执行_部门_物品发放_明细 (uh_ex_dept_pdde_dt / com.yonyou.yh.nhis.ex.pd.vo.DeptPDAppDeliDtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6078.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptpddedt | 部门物品发放明细主键 | pk_deptpddedt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_deptpdde | 部门物品发放 | pk_deptpdde | varchar(20) |  | 医疗执行_部门_物品发放 (deptpdappdeli) |
| 5 | pk_deptpdapdt | 部门物品请领明细 | pk_deptpdapdt | varchar(20) |  | 医疗执行_部门_物品请领(退)_明细 (deptpdappdt) |
| 6 | eu_direct | 发退方向 | eu_direct | int |  | 整数 (Integer) |
| 7 | eu_pdtype | 物品类型 | eu_pdtype | int |  | 整数 (Integer) |
| 8 | pk_pd | 物品 | pk_pd | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | code_pd | 物品编码 | code_pd | varchar(50) |  | 字符串 (String) |
| 10 | batch | 物品批号 | batch | varchar(50) |  | 字符串 (String) |
| 11 | pk_measdoc_cur | 物品包装单位_当前 | pk_measdoc_cur | varchar(20) |  | 计量单位 (measdoc) |
| 12 | pk_measdoc_base | 物品包装单位_基本 | pk_measdoc_base | varchar(20) |  | 计量单位 (measdoc) |
| 13 | factor_cb | 换算系数_当前与基本 | factor_cb | varchar(50) |  | 字符串 (String) |
| 14 | price_sp | 售价_零售单位(主单位) | price_sp | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | purprice_sp | 进价_零售单位(主单位) | purprice_sp | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | quan_cur_de | 实发退数量_当前 | quan_cur_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | quan_base_de | 实发退数量_基本 | quan_base_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | amount_de | 实发退金额 | amount_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | flag_inv | 已出库标志 | flag_inv | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | pk_inv | 对应出库 | pk_inv | varchar(50) |  | 字符串 (String) |
| 21 | pk_inv_dt | 对应出库明细 | pk_inv_dt | varchar(50) |  | 字符串 (String) |
| 22 | note | 备注 | note | varchar(50) |  | 字符串 (String) |