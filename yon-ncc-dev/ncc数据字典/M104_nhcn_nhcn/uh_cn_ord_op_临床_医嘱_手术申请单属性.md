# |<<

**临床_医嘱_手术申请单属性 (uh_cn_ord_op / com.yonyou.yh.nhis.cn.ord.v2.vo.CNOrdOpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6026.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordop | 医嘱手术申请单属性主键 | pk_ordop | char(20) | √ | 主键 (UFID) |
| 2 | pk_ord | 医嘱 | pk_ord | varchar(20) |  | 临床_医嘱 (cnorder) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 5 | eu_optype | 手术类型 | eu_optype | varchar(50) |  | 手术申请类型 (enum) |  | 1=择期; |