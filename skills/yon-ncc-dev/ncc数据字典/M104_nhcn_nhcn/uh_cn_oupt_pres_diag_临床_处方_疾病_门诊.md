# |<<

**临床_处方_疾病_门诊 (uh_cn_oupt_pres_diag / com.yonyou.yh.nhis.cn.ord.oc.v2.vo.CNOcPresDiagVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6045.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordpcdiag | 处方诊断主键 | pk_ordpcdiag | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_pres | 处方主键 | pk_pres | char(20) |  | 字符串 (String) |
| 5 | pk_diag | 诊断 | pk_diag | char(20) |  | 主键 (UFID) |
| 6 | note | 备注 | note | varchar(256) |  | 字符串 (String) |