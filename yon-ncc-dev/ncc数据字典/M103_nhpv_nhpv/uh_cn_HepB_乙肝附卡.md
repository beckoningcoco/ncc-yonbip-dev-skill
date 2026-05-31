# |<<

**乙肝附卡 (uh_cn_HepB / com.yonyou.yh.nhis.cn.infect.vo.HepBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6008.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hepb | 乙肝附卡主键 | pk_hepb | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_report | 主卡主键 | pk_report | varchar(20) |  | 传染病上报 (InfectReportVO) |
| 5 | hbsag_tiem | HBsAg阳性时间 | hbsag_tiem | varchar(20) |  | HBsAg阳性时间 (enum) |  | 1=>6个月; |