# |<<

**艾滋病个案随访表 (uh_cn_HIV_visit / com.yonyou.yh.nhis.cn.infect.vo.HIVVisitVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6012.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hiv_visit | 艾滋病个案随访表主键 | pk_hiv_visit | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_report | 主卡主键 | pk_report | varchar(20) |  | 传染病上报 (InfectReportVO) |
| 5 | no_visit | 随访次数 | no_visit | int |  | 整数 (Integer) |
| 6 | imprison | 是否羁押 | imprison | int |  | 是否羁押 (ImprisonEnum) |  | 1=是; |