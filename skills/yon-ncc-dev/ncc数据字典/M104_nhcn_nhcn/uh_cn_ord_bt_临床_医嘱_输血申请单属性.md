# |<<

**临床_医嘱_输血申请单属性 (uh_cn_ord_bt / com.yonyou.yh.nhis.cn.ord.v2.vo.CNOrdBTAppVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6017.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordbt | 医嘱输血申请单属性主键 | pk_ordbt | char(20) | √ | 主键 (UFID) |
| 2 | pk_ord | 医嘱 | pk_ord | varchar(20) |  | 临床_医嘱 (cnorder) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 5 | pk_diag | 当前诊断 | pk_diag | varchar(20) |  | 临床_诊断 (cndiag) |
| 6 | desc_diag | 当前诊断名称串 | desc_diag | varchar(256) |  | 字符串 (String) |
| 7 | aim | 输血目的 | aim | int |  | 输血目的 (trPurposeEnum) |  | 1=纠正贫血; |