# |<<

**临床_医嘱 (uh_cn_ord / com.yonyou.yh.nhis.cn.ord.v2.vo.CNOrderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6016.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ord | 医疗医嘱主键 | pk_ord | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(50) |  | 字符串 (String) |
| 5 | pk_pv | 就诊编码 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 6 | date_valid | 医嘱有效日期 | date_valid | char(19) |  | 日期时间 (UFDateTime) |
| 7 | code_srvtype | 医嘱类型编码 | code_srvtype | varchar(50) |  | 字符串 (String) |
| 8 | eu_recur | 医嘱重复类型 | eu_recur | int |  | 医嘱重复类型 (ordrecurtype) |  | 0=长期; |