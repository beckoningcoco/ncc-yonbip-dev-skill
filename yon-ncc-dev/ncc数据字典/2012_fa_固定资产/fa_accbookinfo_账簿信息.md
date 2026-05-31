# |<<

**账簿信息 (fa_accbookinfo / nc.vo.fa.accbookinfo.AccbookHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1980.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accbookinfo | 主键 | pk_accbookinfo | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_setofbook | 帐簿 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 5 | convert_date | 外币折算日期 | convert_date | int | √ | 外币折算日期 (convertData) | 0 | 0=卡片建卡日期; |