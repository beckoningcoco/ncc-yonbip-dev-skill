# |<<

**艾滋病附卡 (uh_cn_HIV / com.yonyou.yh.nhis.cn.infect.vo.HIVVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6011.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hiv | 艾滋病附卡 | pk_hiv | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_report | 主卡主键 | pk_report | varchar(20) |  | 传染病上报 (InfectReportVO) |
| 5 | nation | 民族 | nation | varchar(20) |  | 民族HIS(自定义档案) (Defdoc-000003) |
| 6 | marriage | 婚姻状况 | marriage | varchar(20) |  | 婚姻状况HIS(自定义档案) (Defdoc-000006) |
| 7 | culture | 文化程度 | culture | varchar(20) |  | 文化程度(自定义档案) (Defdoc-070100) |
| 8 | contact | 接触史 | contact | varchar(20) |  | 接触史 (ContactEnum) |  | 1=注射毒品史; |