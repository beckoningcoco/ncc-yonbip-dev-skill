# |<<

**银行对账单管理 (ebank_dzd / nc.vo.obm.ebankdzd.EbankDzdVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1767.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebank_dzd | 主键 | pk_ebank_dzd | char(20) | √ | 主键 (UFID) |
| 2 | billmaker | 用户ID | billmaker | varchar(20) |  | 用户 (user) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 6 | trans_date | 交易日期 | trans_date | char(19) | √ | 日期(开始) (UFDateBegin) |
| 7 | trans_time | 交易时间 | trans_time | char(8) |  | 时间 (UFTime) |
| 8 | curacc | 本方账号 | curacc | varchar(50) | √ | 字符串 (String) |
| 9 | curname | 本方户名 | curname | varchar(100) |  | 字符串 (String) |
| 10 | banktypecode | 银行类别编码 | banktypecode | varchar(40) |  | 字符串 (String) |
| 11 | oppacc | 对方账号 | oppacc | varchar(50) |  | 字符串 (String) |
| 12 | oppname | 对方户名 | oppname | varchar(100) |  | 字符串 (String) |
| 13 | cdflag | 收付标志 | cdflag | varchar(10) |  | 字符串 (String) |
| 14 | grpacc | 母/子公司账号 | grpacc | varchar(50) |  | 字符串 (String) |
| 15 | trsamt | 交易金额 | trsamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | oppbalance | 对方余额 | oppbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | check_num | 凭证号 | check_num | varchar(100) |  | 字符串 (String) |
| 18 | c_ccynbr | 币种 | c_ccynbr | varchar(50) |  | 字符串 (String) |
| 19 | currcode | 币种编码 | currcode | varchar(50) | √ | 字符串 (String) |
| 20 | currname | 币种名称 | currname | varchar(50) |  | 字符串 (String) |
| 21 | trans_abstr | 摘要 | trans_abstr | varchar(500) |  | 字符串 (String) |
| 22 | nusage | 用途 | nusage | varchar(200) |  | 字符串 (String) |
| 23 | serialno | 序号 | serialno | int |  | 整数 (Integer) |
| 24 | styleflag | 新旧标志 | styleflag | char(1) |  | 字符串 (String) |
| 25 | yurref | 业务参考号 | yurref | varchar(100) |  | 字符串 (String) |
| 26 | xyflag | 协议划款标识 | xyflag | varchar(100) |  | 字符串 (String) |
| 27 | trans_type | 业务种类 | trans_type | varchar(100) |  | 字符串 (String) |
| 28 | uid2 | 唯一号 | uid2 | varchar(200) | √ | 字符串 (String) |
| 29 | txseqid | 交易流水号 | txseqid | varchar(100) |  | 字符串 (String) |
| 30 | accthostseqid | 会计系统主机流水号 | accthostseqid | varchar(100) |  | 字符串 (String) |
| 31 | traceno | 交易号 | traceno | varchar(50) |  | 字符串 (String) |
| 32 | ishand | 手工 | ishand | varchar(10) |  | 字符串 (String) |
| 33 | reconciliationcode | 自动对账标志码 | reconciliationcode | varchar(100) |  | 字符串 (String) |
| 34 | represerved1 | 备用字段1 | represerved1 | varchar(100) |  | 字符串 (String) |
| 35 | represerved2 | 备用字段2 | represerved2 | varchar(50) |  | 字符串 (String) |
| 36 | dbtacc | 收方账号 | dbtacc | varchar(50) |  | 字符串 (String) |
| 37 | crtacc | 付方账号 | crtacc | varchar(50) |  | 字符串 (String) |
| 38 | dbtbalance | 收方余额 | dbtbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 39 | crtbalance | 付方余额 | crtbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 40 | dbtdwmc | 收方单位 | dbtdwmc | varchar(50) |  | 字符串 (String) |
| 41 | crtdwmc | 付方单位 | crtdwmc | varchar(50) |  | 字符串 (String) |
| 42 | isncdata | 是否NC生成 | isncdata | char(1) |  | 布尔类型 (UFBoolean) |
| 43 | pk_curaccsub | 本方账户子户PK | pk_curaccsub | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 44 | curaccsub | 本方账户子户 | curaccsub | varchar(50) |  | 字符串 (String) |
| 45 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 47 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 48 | olcamount | 组织本币金额 | olcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 49 | glcamount | 集团本币金额 | glcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 50 | gllcamount | 全局本币金额 | gllcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 51 | consignagreement | 托收协议号 | consignagreement | varchar(20) |  | 托收协议 (mandate) |
| 52 | sddreversalflag | 直接借记退回标记 | sddreversalflag | char(1) |  | 布尔类型 (UFBoolean) |
| 53 | noteno | 到账通知票据号 | noteno | varchar(140) |  | 字符串 (String) |
| 54 | europdomain | 交易码 | europdomain | varchar(20) |  | 银行交易代码(自定义档案) (Defdoc-SYS006_0xx) |
| 55 | family | family | family | varchar(20) |  | 银行交易代码(自定义档案) (Defdoc-SYS006_0xx) |
| 56 | subfamily | 交易子码 | subfamily | varchar(20) |  | 银行交易代码(自定义档案) (Defdoc-SYS006_0xx) |
| 57 | payreason | 支付原因 | payreason | varchar(181) |  | 字符串 (String) |
| 58 | credttm | 对账单创建时间 | credttm | char(19) |  | 日期 (UFDate) |
| 59 | elctrncseqnb | 对账单电子序号 | elctrncseqnb | varchar(18) |  | 字符串 (String) |
| 60 | lglseqnb | 对账单纸质序号 | lglseqnb | varchar(18) |  | 字符串 (String) |
| 61 | stmtcredttm | 对账单的创建日期 | stmtcredttm | char(19) |  | 日期 (UFDate) |
| 62 | frdttm | 签发账单的开始日期 | frdttm | char(19) |  | 日期 (UFDate) |
| 63 | todttm | 签发账单的结束日期 | todttm | char(19) |  | 日期 (UFDate) |
| 64 | accprtry | 本方账户的专属性质 | accprtry | varchar(35) |  | 字符串 (String) |
| 65 | orgname | 本方账号所属使用权组织名 | orgname | varchar(70) |  | 字符串 (String) |
| 66 | orgid | 本方账号所属使用权组织名标识 | orgid | varchar(35) |  | 字符串 (String) |
| 67 | txssummry | 对账单中金额总和 | txssummry | decimal(28, 8) |  | 数值 (UFDouble) |
| 68 | numofdzd | 对账单中分录数量 | numofdzd | int |  | 整数 (Integer) |
| 69 | cdtnum | 贷方分录的数量 | cdtnum | int |  | 整数 (Integer) |
| 70 | cdtsum | 贷方分录的交易金额 | cdtsum | decimal(28, 8) |  | 数值 (UFDouble) |
| 71 | dbtnum | 借方分录的数量 | dbtnum | int |  | 整数 (Integer) |
| 72 | dbtsum | 借方分录的交易金额 | dbtsum | decimal(28, 8) |  | 数值 (UFDouble) |
| 73 | subtotalamt | 分录中所有金额总和 | subtotalamt | decimal(28, 8) |  | 数值 (UFDouble) |
| 74 | cdtdbtind | 借贷标志 | cdtdbtind | varchar(10) |  | 字符串 (String) |
| 75 | stus | 分录状态 | stus | varchar(10) |  | 字符串 (String) |
| 76 | bookgdt | 过账时间 | bookgdt | char(19) |  | 日期 (UFDate) |
| 77 | valdt | 起息日 | valdt | char(19) |  | 日期 (UFDate) |
| 78 | cntrvalamt | 对等价值金额 | cntrvalamt | decimal(28, 8) |  | 数值 (UFDouble) |
| 79 | srcccy | 源币种 | srcccy | varchar(3) |  | 字符串 (String) |
| 80 | trgtccy | 目标币种 | trgtccy | varchar(3) |  | 字符串 (String) |
| 81 | unitccy | 单位币种 | unitccy | varchar(3) |  | 字符串 (String) |
| 82 | xchgrate | 汇率 | xchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 83 | prtryamttp | 金额类型 | prtryamttp | varchar(35) |  | 字符串 (String) |
| 84 | prtryamt | 兑换金额 | prtryamt | decimal(28, 8) |  | 数值 (UFDouble) |
| 85 | ttlchrgsandtaxamt | 税费合计 | ttlchrgsandtaxamt | decimal(28, 8) |  | 数值 (UFDouble) |
| 86 | chrgsamt | 交易费用 | chrgsamt | decimal(28, 8) |  | 数值 (UFDouble) |
| 87 | chrgscdtdbtind | 收费金额是贷方金额还是借方金额 | chrgscdtdbtind | varchar(10) |  | 字符串 (String) |
| 88 | chrgstp | 费用类型 | chrgstp | varchar(10) |  | 字符串 (String) |
| 89 | chrgsissr | 费用签发方 | chrgsissr | varchar(35) |  | 字符串 (String) |
| 90 | chrgsrate | 费用比率 | chrgsrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 91 | taxid | 税收标示 | taxid | varchar(35) |  | 字符串 (String) |
| 92 | taxrate | 税收比例 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 93 | taxamt | 税收金额 | taxamt | decimal(28, 8) |  | 数值 (UFDouble) |
| 94 | pmtinfid | 批处理流水号 | pmtinfid | varchar(35) |  | 字符串 (String) |
| 95 | stmtid | 对账单ID | stmtid | varchar(35) |  | 字符串 (String) |
| 96 | tranamt | 交易金额(包含税费) | tranamt | decimal(28, 8) |  | 数值 (UFDouble) |
| 97 | msgid | 报文id | msgid | varchar(35) |  | 字符串 (String) |
| 98 | creditorreference | 结构化贷方引用信息 | creditorreference | varchar(50) |  | 字符串 (String) |
| 99 | structuredstandard | 结构化信息标准 | structuredstandard | varchar(50) |  | 字符串 (String) |
| 100 | obmdef1 | 自定义项1 | obmdef1 | varchar(101) |  | 自定义项 (Custom) |
| 101 | obmdef2 | 自定义项2 | obmdef2 | varchar(101) |  | 自定义项 (Custom) |
| 102 | obmdef3 | 自定义项3 | obmdef3 | varchar(101) |  | 自定义项 (Custom) |
| 103 | obmdef4 | 自定义项4 | obmdef4 | varchar(101) |  | 自定义项 (Custom) |
| 104 | obmdef5 | 自定义项5 | obmdef5 | varchar(101) |  | 自定义项 (Custom) |