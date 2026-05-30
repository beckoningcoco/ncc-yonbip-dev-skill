# |<<

**事项记录 (scapto_matter_record / nc.vo.scapto.mattermanage.matterlistreport.MatterRecordVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5146.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_matterrecord | 事项记录子表主键 | pk_matterrecord | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_matterdirectory | 事项目录编码 | pk_matterdirectory | varchar(20) |  | 事项目录设置 (MatterDirectoryVO) |
| 4 | matterdirectoryname | 事项目录名称 | matterdirectoryname | varchar(80) |  | 字符串 (String) |
| 5 | mattercode | 事项编码 | mattercode | varchar(128) |  | 字符串 (String) |
| 6 | mattername | 事项名称 | mattername | varchar(1024) |  | 字符串 (String) |
| 7 | pk_decidemeettype | 决策会议及顺序 | pk_decidemeettype | varchar(2000) |  | 字符串 (String) |
| 8 | decidemeetcode | 决策会议及顺序编码 | decidemeetcode | varchar(2000) |  | 字符串 (String) |
| 9 | decidemeetname | 决策会议及顺序名称 | decidemeetname | varchar(2000) |  | 字符串 (String) |
| 10 | bislawverify | 是否经过法律审核 | bislawverify | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | vmemo | 备注 | vmemo | varchar(1024) |  | 备注 (Memo) |
| 12 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 字符串 (String) |
| 13 | vsrccode | 来源单据号 | vsrccode | varchar(50) |  | 字符串 (String) |
| 14 | csrcid | 来源单据主表主键 | csrcid | char(20) |  | 主键 (UFID) |
| 15 | csrcbid | 来源单据表体主键 | csrcbid | char(20) |  | 主键 (UFID) |
| 16 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 17 | vsrctrantype | 来源交易类型 | vsrctrantype | varchar(20) |  | 字符串 (String) |
| 18 | cfirstid | 源头单据主表主键 | cfirstid | char(20) |  | 主键 (UFID) |
| 19 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 字符串 (String) |
| 20 | vfirstcode | 源头单据号 | vfirstcode | varchar(50) |  | 字符串 (String) |
| 21 | cfirstbid | 源头单据表体主键 | cfirstbid | char(20) |  | 主键 (UFID) |
| 22 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 23 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 字符串 (String) |
| 24 | vreserve1 | 预留字段1 | vreserve1 | varchar(100) |  | 字符串 (String) |
| 25 | vreserve2 | 预留字段2 | vreserve2 | varchar(100) |  | 字符串 (String) |
| 26 | vreserve3 | 预留字段3 | vreserve3 | varchar(100) |  | 字符串 (String) |
| 27 | vreserve4 | 预留字段4 | vreserve4 | varchar(100) |  | 字符串 (String) |
| 28 | vreserve5 | 预留字段5 | vreserve5 | varchar(100) |  | 字符串 (String) |
| 29 | vreserve6 | 预留字段6 | vreserve6 | varchar(100) |  | 字符串 (String) |
| 30 | vreserve7 | 预留字段7 | vreserve7 | varchar(100) |  | 字符串 (String) |
| 31 | vreserve8 | 预留字段8 | vreserve8 | varchar(100) |  | 字符串 (String) |
| 32 | vreserve9 | 预留字段9 | vreserve9 | varchar(100) |  | 字符串 (String) |
| 33 | vreserve10 | 预留字段10 | vreserve10 | varchar(100) |  | 字符串 (String) |
| 34 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |