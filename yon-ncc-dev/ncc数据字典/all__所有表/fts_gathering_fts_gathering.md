# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8395.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_gathering | pk_gathering | pk_gathering | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | auditdate | auditdate | auditdate | char(19) |
| 5 | audittime | audittime | audittime | char(19) |
| 6 | backdate | backdate | backdate | char(19) |
| 7 | backtime | backtime | backtime | char(19) |
| 8 | backuser | backuser | backuser | varchar2(20) |  |  | '~' |
| 9 | backxjreason | backxjreason | backxjreason | varchar2(272) |
| 10 | billdate | billdate | billdate | char(19) |
| 11 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 12 | billstatus | billstatus | billstatus | number(38, 0) |
| 13 | billtime | billtime | billtime | char(19) |
| 14 | bookaccdate | bookaccdate | bookaccdate | char(19) |
| 15 | businessno | businessno | businessno | varchar2(50) |
| 16 | cleardate | cleardate | cleardate | char(19) |
| 17 | clearinacctype | clearinacctype | clearinacctype | varchar2(30) |
| 18 | clearinszdirection | clearinszdirection | clearinszdirection | varchar2(30) |
| 19 | clearoutacctype | clearoutacctype | clearoutacctype | varchar2(30) |
| 20 | clearoutszdirection | clearoutszdirection | clearoutszdirection | varchar2(30) |
| 21 | consigndate | consigndate | consigndate | char(19) |
| 22 | consigner | consigner | consigner | varchar2(20) |  |  | '~' |
| 23 | consigntime | consigntime | consigntime | char(19) |
| 24 | decidedate | decidedate | decidedate | char(19) |
| 25 | decidetime | decidetime | decidetime | char(19) |
| 26 | decideuser | decideuser | decideuser | varchar2(20) |  |  | '~' |
| 27 | decidewfstatus | decidewfstatus | decidewfstatus | number(38, 0) |
| 28 | deliverdate | deliverdate | deliverdate | char(19) |
| 29 | delivertime | delivertime | delivertime | char(19) |
| 30 | delivertype | delivertype | delivertype | varchar2(30) |
| 31 | deliveruser | deliveruser | deliveruser | varchar2(20) |  |  | '~' |
| 32 | deliverwfstatus | deliverwfstatus | deliverwfstatus | number(38, 0) |
| 33 | destdeliverdirection | destdeliverdirection | destdeliverdirection | varchar2(30) |
| 34 | exprice | exprice | exprice | number(28, 8) |
| 35 | gatheringdate | gatheringdate | gatheringdate | char(19) |
| 36 | gatheringtime | gatheringtime | gatheringtime | char(19) |
| 37 | gatheringuser | gatheringuser | gatheringuser | varchar2(20) |  |  | '~' |
| 38 | gatheringwfstatus | gatheringwfstatus | gatheringwfstatus | number(38, 0) |
| 39 | gathertotalmnt | gathertotalmnt | gathertotalmnt | number(28, 8) |
| 40 | glcexdiffmnt | glcexdiffmnt | glcexdiffmnt | number(28, 8) |
| 41 | glcgathertotalmnt | glcgathertotalmnt | glcgathertotalmnt | number(28, 8) |
| 42 | glctotalamount | glctotalamount | glctotalamount | number(28, 8) |
| 43 | gllcexdiffmnt | gllcexdiffmnt | gllcexdiffmnt | number(28, 8) |
| 44 | gllcgathertotalmnt | gllcgathertotalmnt | gllcgathertotalmnt | number(28, 8) |
| 45 | gllctotalamount | gllctotalamount | gllctotalamount | number(28, 8) |
| 46 | isbssign | isbssign | isbssign | char(1) |
| 47 | isdeliverback | isdeliverback | isdeliverback | char(1) |
| 48 | isexchangegather | isexchangegather | isexchangegather | char(1) |
| 49 | isinform | isinform | isinform | char(1) |
| 50 | isreversebustype | isreversebustype | isreversebustype | char(1) |
| 51 | isunitback | isunitback | isunitback | char(1) |
| 52 | makevdate | makevdate | makevdate | char(19) |
| 53 | makevtime | makevtime | makevtime | char(19) |
| 54 | makevuser | makevuser | makevuser | varchar2(20) |  |  | '~' |
| 55 | memo | memo | memo | varchar2(300) |
| 56 | olcexdiffmnt | olcexdiffmnt | olcexdiffmnt | number(28, 8) |
| 57 | olcgathertotalmnt | olcgathertotalmnt | olcgathertotalmnt | number(28, 8) |
| 58 | olctotalamount | olctotalamount | olctotalamount | number(28, 8) |
| 59 | pk_billtype | pk_billtype | pk_billtype | varchar2(21) |
| 60 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 61 | pk_clearinaccount | pk_clearinaccount | pk_clearinaccount | varchar2(20) |  |  | '~' |
| 62 | pk_clearinplan | pk_clearinplan | pk_clearinplan | varchar2(20) |  |  | '~' |
| 63 | pk_clearoutaccount | pk_clearoutaccount | pk_clearoutaccount | varchar2(20) |  |  | '~' |
| 64 | pk_clearoutplan | pk_clearoutplan | pk_clearoutplan | varchar2(20) |  |  | '~' |
| 65 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 66 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 67 | pk_delgoorg | pk_delgoorg | pk_delgoorg | varchar2(20) |  |  | '~' |
| 68 | pk_delsourceorg | pk_delsourceorg | pk_delsourceorg | varchar2(20) |  |  | '~' |
| 69 | pk_fundgetorg | pk_fundgetorg | pk_fundgetorg | varchar2(20) |  |  | '~' |
| 70 | pk_fundgetorg_v | pk_fundgetorg_v | pk_fundgetorg_v | varchar2(20) |  |  | '~' |
| 71 | pk_gaincenter | pk_gaincenter | pk_gaincenter | varchar2(20) |  |  | '~' |
| 72 | pk_gathercurr | pk_gathercurr | pk_gathercurr | varchar2(20) |
| 73 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 74 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 75 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 76 | pk_original | pk_original | pk_original | varchar2(20) |  |  | '~' |
| 77 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |  |  | '~' |
| 78 | pk_transactorg | pk_transactorg | pk_transactorg | varchar2(20) |  |  | '~' |
| 79 | pk_transactorg_v | pk_transactorg_v | pk_transactorg_v | varchar2(20) |  |  | '~' |
| 80 | pk_vsourcebilltype | pk_vsourcebilltype | pk_vsourcebilltype | varchar2(21) |
| 81 | pk_vsourcebilltypeid | pk_vsourcebilltypeid | pk_vsourcebilltypeid | varchar2(20) |  |  | '~' |
| 82 | pk_vsourcedealtype | pk_vsourcedealtype | pk_vsourcedealtype | varchar2(21) |
| 83 | pk_vsourcedealtypeid | pk_vsourcedealtypeid | pk_vsourcedealtypeid | varchar2(20) |  |  | '~' |
| 84 | purpose | purpose | purpose | varchar2(300) |
| 85 | recmodul | recmodul | recmodul | varchar2(30) |
| 86 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 87 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 88 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 89 | saga_status | saga_status | saga_status | number(38, 0) |
| 90 | sjbackreason | sjbackreason | sjbackreason | varchar2(272) |
| 91 | sourcebusitype | sourcebusitype | sourcebusitype | varchar2(50) |
| 92 | srcdeliverdirection | srcdeliverdirection | srcdeliverdirection | varchar2(30) |
| 93 | strokes | strokes | strokes | number(38, 0) |
| 94 | submitdate | submitdate | submitdate | char(19) |
| 95 | submittime | submittime | submittime | char(19) |
| 96 | submituser | submituser | submituser | varchar2(20) |  |  | '~' |
| 97 | totalamount | totalamount | totalamount | number(28, 8) |
| 98 | unitapprover | unitapprover | unitapprover | varchar2(20) |  |  | '~' |
| 99 | unitbillmaker | unitbillmaker | unitbillmaker | varchar2(20) |  |  | '~' |
| 100 | vapprovenote | vapprovenote | vapprovenote | varchar2(1536) |
| 101 | vbillno | vbillno | vbillno | varchar2(50) |
| 102 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 103 | voucherflag | voucherflag | voucherflag | char(1) |
| 104 | vsourcebustype | vsourcebustype | vsourcebustype | varchar2(30) |
| 105 | vsourcecode | vsourcecode | vsourcecode | varchar2(50) |
| 106 | wfsubmituser | wfsubmituser | wfsubmituser | varchar2(20) |  |  | '~' |
| 107 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 108 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 109 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 110 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 111 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 112 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 113 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 114 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 115 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 116 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 117 | creationtime | creationtime | creationtime | char(19) |
| 118 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 119 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 120 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 121 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 122 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |