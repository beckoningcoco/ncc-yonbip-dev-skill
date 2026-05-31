# |<<

**临床_医嘱_医疗记录 (uh_cn_oupt_ord_emr / com.yonyou.yh.nhis.cn.ord.oc.v2.vo.CNOcOrdEmrVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6035.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordecd | 医嘱文档主键 | pk_ordecd | char(20) | √ | 主键 (UFID) |
| 2 | pk_ord | 医嘱 | pk_ord | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 4 | pk_org | 所属机构 | pk_org | varchar(20) |  | 字符串 (String) |
| 5 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 6 | date_ecd | 文档日期 | date_ecd | char(19) |  | 日期 (UFDate) |
| 7 | pk_emr | 文档 | pk_emr | varchar(50) |  | 字符串 (String) |