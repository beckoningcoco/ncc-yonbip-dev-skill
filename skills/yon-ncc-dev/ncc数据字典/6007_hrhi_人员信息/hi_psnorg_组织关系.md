# |<<

**组织关系 (hi_psnorg / nc.vo.hi.psndoc.PsnOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2599.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psnorg | 组织关系主键 | pk_psnorg | char(20) | √ | 主键 (UFID) |
| 2 | empforms | 用工形式 | empforms | varchar(20) |  | 用工形式(自定义档案) (Defdoc-HR006_0xx) |
| 3 | startpaydate | 薪资开始日期 | startpaydate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 4 | stoppaydate | 薪资停发日期 | stoppaydate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 5 | begindate | 进入日期 | begindate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 6 | enddate | 退出日期 | enddate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 7 | joinsysdate | 进入集团日期 | joinsysdate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 8 | adjustcorpage | 增减集团工龄 | adjustcorpage | int |  | 整数 (Integer) |  | [-999 , 9999] |
| 9 | pk_org | 组织 | pk_org | char(20) | √ | 组织 (org) |
| 10 | indocflag | 转入人员档案 | indocflag | char(1) | √ | 布尔类型 (UFBoolean) |
| 11 | endflag | 终止 | endflag | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | lastflag | 最新标志 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | indoc_source | 入职来源 | indoc_source | int |  | 入职来源 (IndocSource) |  | 1=入职登记; |