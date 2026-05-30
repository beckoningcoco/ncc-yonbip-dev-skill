# |<<

**流动情况 (hi_psndoc_psnchg / nc.vo.hi.psndoc.PsnChgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2578.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 人员子表主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | begindate | 到职日期 | begindate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 3 | enddate | 离职日期 | enddate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 4 | assgid | 人员任职ID | assgid | int |  | 整数 (Integer) |
| 5 | cometype | 进入来源 | cometype | varchar(20) |  | 进入来源(自定义档案) (Defdoc-HRHI013_0xx) |
| 6 | comecorpname | 来源单位名称 | comecorpname | varchar(200) |  | 字符串 (String) |
| 7 | comecorpprp | 来源单位性质 | comecorpprp | varchar(20) |  | 来往单位性质(自定义档案) (Defdoc-HRHI008_0xx) |
| 8 | comecorpaddr | 来源单位所在地 | comecorpaddr | varchar(20) |  | 行政区划 (region) |
| 9 | tocorpname | 去向单位名称 | tocorpname | varchar(200) |  | 字符串 (String) |
| 10 | totype | 减员途径 | totype | varchar(20) |  | 减员途径(自定义档案) (Defdoc-HRHI014_0xx) |
| 11 | tocorpprp | 去向单位性质 | tocorpprp | varchar(20) |  | 来往单位性质(自定义档案) (Defdoc-HRHI008_0xx) |
| 12 | tocorpaddr | 去向单位所在地 | tocorpaddr | varchar(20) |  | 行政区划 (region) |
| 13 | org_workage | 增减司龄 | org_workage | int |  | 整数 (Integer) |  | [-999 , 9999] |
| 14 | memo | 备注 | memo | varchar(1024) |  | 字符串 (String) |
| 15 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 16 | lastflag | 最近记录标志 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | pk_psndoc | 人员主键 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 18 | pk_psnorg | 组织关系主键 | pk_psnorg | varchar(20) |  | 组织关系 (hi_psnorg) |
| 19 | pk_corp | 任职单位 | pk_corp | char(20) | √ | 组织_业务单元_行政组织 (adminorg) |
| 20 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 21 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织_业务单元_人力资源组织 (hrorg) |
| 22 | orgage | 司龄 | orgage | 100 |  | 字符串 (String) |
| 23 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 24 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 25 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 26 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |