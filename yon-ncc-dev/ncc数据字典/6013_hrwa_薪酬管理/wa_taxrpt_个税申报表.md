# |<<

**个税申报表 (wa_taxrpt / nc.vo.wa.taxreport.TaxReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6364.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_taxrpt | 主键 | pk_wa_taxrpt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | orgvid | 组织版本 | orgvid | char(20) |  | 主键 (UFID) |
| 5 | pk_dept | 部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | deptvid | 部门版本 | deptvid | char(20) |  | 主键 (UFID) |
| 7 | pk_psndoc | 人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 8 | psnname | 纳税人姓名 | psnname | varchar(200) |  | 多语文本 (MultiLangText) |
| 9 | countryname | 国籍 | countryname | varchar(200) |  | 多语文本 (MultiLangText) |
| 10 | idtype | 身份证照类型 | idtype | varchar(20) |  | 证件类别 (psnidtype) |
| 11 | id | 身份证照号码 | id | varchar(25) |  | 字符串 (String) |
| 12 | workcorp | 任职受雇单位 | workcorp | varchar(200) |  | 多语文本 (MultiLangText) |
| 13 | taxno | 单位税务代码 | taxno | varchar(100) |  | 字符串 (String) |
| 14 | comindstry | 单位所属行业 | comindstry | varchar(200) |  | 多语文本 (MultiLangText) |
| 15 | dutyname | 职务 | dutyname | varchar(200) |  | 多语文本 (MultiLangText) |
| 16 | vocation | 职业 | vocation | varchar(200) |  | 多语文本 (MultiLangText) |
| 17 | incndays | 在华天数 | incndays | int |  | 整数 (Integer) |
| 18 | addr | 联系地址 | addr | varchar(60) |  | 字符串 (String) |
| 19 | postalcode | 联系地址邮编 | postalcode | char(20) |  | 主键 (UFID) |
| 20 | mobile | 联系电话 | mobile | varchar(30) |  | 字符串 (String) |
| 21 | cyear | 薪资年 | cyear | char(4) |  | 主键 (UFID) |
| 22 | incomen | 年所得额(境内) | incomen | decimal(31, 8) |  | 数值 (UFDouble) |
| 23 | incomew | 年所得额(境外) | incomew | decimal(31, 8) |  | 数值 (UFDouble) |
| 24 | incometotal | 年所得额(合计) | incometotal | decimal(31, 8) |  | 数值 (UFDouble) |
| 25 | incometax | 应纳税所得额 | incometax | decimal(31, 8) |  | 数值 (UFDouble) |
| 26 | taxqut | 应纳税额 | taxqut | decimal(31, 8) |  | 数值 (UFDouble) |
| 27 | taxedqut | 已缴(扣)税额 | taxedqut | decimal(31, 8) |  | 数值 (UFDouble) |
| 28 | taxkill | 抵扣税额 | taxkill | decimal(31, 8) |  | 数值 (UFDouble) |
| 29 | taxfree | 减免税额 | taxfree | decimal(31, 8) |  | 数值 (UFDouble) |
| 30 | taxappend | 应补税额 | taxappend | decimal(31, 8) |  | 数值 (UFDouble) |
| 31 | taxhandback | 应退税额 | taxhandback | decimal(31, 8) |  | 数值 (UFDouble) |
| 32 | memo | 备注 | memo | varchar(50) |  | 字符串 (String) |
| 33 | pk_country | 国家区域 | pk_country | varchar(50) |  | 字符串 (String) |