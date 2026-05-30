# |<<

**医疗执行_医嘱_物品_明细_操作流水 (uh_ex_ord_pd_deli_dt / com.yonyou.yh.nhis.pd.ordpdapply.vo.OrdPDAppDeliItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6101.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordpddtlist | 医嘱物品操作流水主键 | pk_ordpddtlist | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_ordpddt | 医嘱物品明细 | pk_ordpddt | varchar(20) |  | 医疗执行_医嘱_物品_请领明细 (ordpdappitem) |
| 5 | date_list | 发退日期 | date_list | char(19) |  | 日期时间 (UFDateTime) |
| 6 | eu_direct | 发退方向 | eu_direct | int |  | 医疗执行物品发退方向 (ordpddirectenum) |  | 1=发药; |