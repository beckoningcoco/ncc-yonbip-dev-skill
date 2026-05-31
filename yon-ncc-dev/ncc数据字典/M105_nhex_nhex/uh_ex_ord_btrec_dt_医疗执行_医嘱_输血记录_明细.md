# |<<

**医疗执行_医嘱_输血记录_明细 (uh_ex_ord_btrec_dt / com.yonyou.yh.nhis.ex.mt.vo.OrdMTAppBTRecItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6086.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_btrecdt | 输血记录明细主键 | pk_btrecdt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_btrec | 输血记录 | pk_btrec | varchar(20) |  | 医疗执行_医嘱_输血记录 (ordmtappbtrec) |
| 5 | code_bb | 血袋编码 | code_bb | varchar(50) |  | 字符串 (String) |
| 6 | quan_bt | 输血量 | quan_bt | decimal(14, 2) |  | 数值 (UFDouble) |
| 7 | note | 备注 | note | varchar(256) |  | 字符串 (String) |